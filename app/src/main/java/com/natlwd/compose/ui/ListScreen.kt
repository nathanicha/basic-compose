package com.natlwd.compose.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.natlwd.compose.model.DataProvider
import com.natlwd.compose.model.User


/**
 *  Reference: https://www.waseefakhtar.com/android/recyclerview-in-jetpack-compose/
 */
@Composable
fun ListContent() {
    val userList = remember { DataProvider.userList }
    //LazyColumn - RecyclerView
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
        items(userList) { user ->
            ListItem(user)
        }
    }
}

@Composable
fun ListItem(user: User) {
    Card(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
//        Image(
//            painter = painterResource(R.drawable.ic_launcher_background),
//            contentDescription = "Contact profile picture",
//            modifier = Modifier
//                .clip(CircleShape)
//                .border(1.5.dp, MaterialTheme.colors.primary, CircleShape)
//        )
            Column(modifier = Modifier.padding(8.dp).fillMaxWidth().align(Alignment.CenterVertically)) {
                Text(text = user.id.toString(), color = MaterialTheme.colors.primary)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = user.title)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainViewPreview() {
    ListContent()
}