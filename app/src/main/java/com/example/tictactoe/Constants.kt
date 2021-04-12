package com.example.tictactoe

object Constants {
    const val PLAYER1: String = "player1"
    const val PLAYER2: String = "player2"
    const val ONE_PLAYER_GAME: String = "NO"
    const val TWO_PLAYER_GAME: String = "NO"

    fun getGridInfo():ArrayList<gridInfo>{
        val gridInfo = ArrayList<gridInfo>()

        //1st grid info
    var gridInformation = gridInfo(
        0,
        ""
    )
        gridInfo.add(gridInformation)

        //2nd grid info
        gridInformation = gridInfo(
            1,
            ""
        )
        gridInfo.add(gridInformation)

        //3rd grid info
        gridInformation = gridInfo(
            2,
            ""
        )
        gridInfo.add(gridInformation)

        //4th grid info
        gridInformation = gridInfo(
            3,
            ""
        )
        gridInfo.add(gridInformation)

        //5th grid info
        gridInformation = gridInfo(
            4,
            ""
        )
        gridInfo.add(gridInformation)

        //6th grid info
        gridInformation = gridInfo(
            5,
            ""
        )
        gridInfo.add(gridInformation)

        //7th grid info
        gridInformation = gridInfo(
            6,
            ""
        )
        gridInfo.add(gridInformation)

        //8th grid info
        gridInformation = gridInfo(
            7,
            ""
        )
        gridInfo.add(gridInformation)

        //9th grid info
        gridInformation = gridInfo(
            8,
            ""
        )
        gridInfo.add(gridInformation)

        return gridInfo
    }
}