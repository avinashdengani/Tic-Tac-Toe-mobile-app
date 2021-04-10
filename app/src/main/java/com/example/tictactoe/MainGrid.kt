package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.concurrent.timer
import kotlin.random.Random

class MainGrid : AppCompatActivity() {

    lateinit var grid0: TextView
    lateinit var grid1: TextView
    lateinit var grid2: TextView
    lateinit var grid3: TextView
    lateinit var grid4: TextView
    lateinit var grid5: TextView
    lateinit var grid6: TextView
    lateinit var grid7: TextView
    lateinit var grid8: TextView
    lateinit var turnView: TextView

    private val gridInfoList = Constants.getGridInfo()
    private var name1:String? = null
    private var name2:String? = null
    private var onePlayerGame:String? = null
    private var twoPlayergame:String? = null

    private var random:Boolean = false
    private var flag:Boolean = true
    private var randomValue:Int = 0
    private var count:Int = 0
    private var currentPlayer:String = ""
    private var currentName:String = ""


    private var isMarked:Boolean = false
    private var isWon:Boolean = false
    private var isGameOver:Boolean = false
    private var text:String = "text"
    private var myRandom:String = ""

    companion object{
        private const val X_TEXT = "X"
        private  const val O_TEXT = "O"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_grid)

        name1 = intent.getStringExtra(Constants.PLAYER1)
        name2 = intent.getStringExtra(Constants.PLAYER2)

        onePlayerGame = intent.getStringExtra(Constants.ONE_PLAYER_GAME)
        twoPlayergame = intent.getStringExtra(Constants.TWO_PLAYER_GAME)

        turnView = findViewById<TextView>(R.id.tvTurn)

        currentName = name1.toString()
        turnView.setText(currentName + "'s turn")

        grid0 = findViewById<TextView>(R.id.btn0)
        grid1 = findViewById<TextView>(R.id.btn1)
        grid2 = findViewById<TextView>(R.id.btn2)
        grid3 = findViewById<TextView>(R.id.btn3)
        grid4 = findViewById<TextView>(R.id.btn4)
        grid5 = findViewById<TextView>(R.id.btn5)
        grid6 = findViewById<TextView>(R.id.btn6)
        grid7 = findViewById<TextView>(R.id.btn7)
        grid8 = findViewById<TextView>(R.id.btn8)
    }


    public fun onStartGameInGrid(view: View){
//        val startGame = findViewById<Button>(R.id.btnStartGameInGrid)
//        startGame.setText("Reset Game")
//        if(onePlayerGame == "1"){
//            flag = true
//            text = humanVSComp()
//        }else{
//            humanVSHuman()
//        }
    }

    public fun onBtn0(view: View){
        val grid:gridInfo = gridInfoList.get(0)
        if(grid.text == "" && flag) {
            myRandom()
            grid0.text = currentPlayer
            grid.text = currentPlayer
            changeCurrentPlayer()
            changeTurn()
            count++
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid0.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }

    public fun onBtn1(view: View){
        val grid:gridInfo = gridInfoList.get(1)
        if(grid.text == "" && flag) {
            myRandom()
            grid1.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid1.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn2(view: View){
        val grid:gridInfo = gridInfoList.get(2)
        if(grid.text == "" && flag) {
            myRandom()
            grid2.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid2.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn3(view: View){
        val grid:gridInfo = gridInfoList.get(3)
        if(grid.text == "" && flag) {
            myRandom()
            grid3.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid3.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn4(view: View){
        val grid:gridInfo = gridInfoList.get(4)
        if(grid.text == "" && flag) {
            myRandom()
            grid4.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid4.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn5(view: View){
        val grid:gridInfo = gridInfoList.get(5)
        if(grid.text == "" && flag) {
            myRandom()
            grid5.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer") {
//            grid5.text = humanVSComp()
//            Toast.makeText(this,"${grid5.text} , ${grid.text}", Toast.LENGTH_SHORT).show()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn6(view: View){
        val grid:gridInfo = gridInfoList.get(6)
        if(grid.text == "" && flag) {
            myRandom()
            grid6.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid6.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn7(view: View){
        val grid:gridInfo = gridInfoList.get(7)
        if(grid.text == "" && flag) {
            myRandom()
            grid7.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag && currentName == "Computer"){
//            grid7.text = humanVSComp()
//            flag = true
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }
    public fun onBtn8(view: View){
        val grid:gridInfo = gridInfoList.get(8)
        if(grid.text == "" && flag) {
            myRandom()
            grid8.text = currentPlayer
            grid.text = currentPlayer
            count++
            changeCurrentPlayer()
            changeTurn()
            if(count<9){
                humanVSComp()
            }
        }
//        else if(!flag){
//            grid8.text = humanVSComp()
//            flag = true
//            flag = false
//        }
//        else{
//            Toast.makeText(this,"Invalid Box :(", Toast.LENGTH_SHORT).show()
//        }
    }

    private fun humanVSHuman(){
        flag = true
    }
    private fun humanVSComp(){
        if(onePlayerGame == "1") {
            text = "text"
            if(currentName == "Computer") {
                while (text != "") {
                    randomValue = rand(0, 8)
                    val grid: gridInfo = gridInfoList.get(randomValue)
                    if (grid.text == "") {
                        count++
                        Handler(Looper.getMainLooper()).postDelayed({
                            Toast.makeText(this, "generated", Toast.LENGTH_SHORT).show()
                            flag = true
                            grid.text = currentPlayer
                            changeCurrentPlayer()
                            changeTurn()
                            var i = 0
                            while( i<9){
                                val grid:gridInfo = gridInfoList.get(i)
                                if(grid0.text == "" && i == 0) {
                                    grid0.text = grid.text
                                }
                                if(grid1.text == "" && i == 1) {
                                    grid1.text = grid.text
                                }
                                if(grid2.text == "" && i == 2) {
                                    grid2.text = grid.text
                                }
                                if(grid3.text == "" && i == 3) {
                                    grid3.text = grid.text
                                }
                                if(grid4.text == "" && i == 4) {
                                    grid4.text = grid.text
                                }
                                if(grid5.text == "" && i == 5) {
                                    grid5.text = grid.text
                                }
                                if(grid6.text == "" && i == 6) {
                                    grid6.text = grid.text
                                }
                                if(grid7.text == "" && i == 7) {
                                    grid7.text = grid.text
                                }
                                if(grid8.text == "" && i == 8) {
                                    grid8.text = grid.text
                                }
                                i++
                            }
                        }, 1000)
                        text = ""
                    }
                }
            }
        }else{
            flag = true
        }

    }

    private fun rand(start: Int, end: Int): Int {
        return Random(System.nanoTime()).nextInt(start, end + 1)
    }
    private fun myRandom(){
        if(!random) {
            randomValue = rand(0, 1)
            if(randomValue == 1) {
                currentPlayer = X_TEXT
            } else {
                currentPlayer = O_TEXT
            }
        }
        random = true
    }
    private fun changeCurrentPlayer(){
        if(currentPlayer == X_TEXT){
            currentPlayer = O_TEXT
        }else{
            currentPlayer = X_TEXT
        }
    }
    private fun changeTurn(){
        if(count<9) {
            if (currentName == name1.toString()) {
                if (name2 == null) {
                    name2 = "Computer"
                }
                flag = false
                currentName = name2.toString()
            } else {
                currentName = name1.toString()
            }
        turnView.setText(currentName + "'s turn")
        }else{
            turnView.setText("")
        }
    }
}