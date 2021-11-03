package com.natlwd.compose.model

data class User(
    val id: Int,
    val title: String
)

object DataProvider{
    val userList = listOf(
        User(
            1,
            "test1"
        ),
        User(
            2,
            "test2"
        ),
        User(
            3,
            "test3"
        )
    )
}