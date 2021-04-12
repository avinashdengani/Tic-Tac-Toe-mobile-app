package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
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
    lateinit var resetGame: TextView

    private val gridInfoList = Constants.getGridInfo()
    private var name1: String? = null
    private var name2: String? = null
    private var onePlayerGame: String? = null
    private var twoPlayergame: String? = null

    private var random: Boolean = false
    private var flag: Boolean = true
    private var reset: Boolean = false
    private var randomValue: Int = 0
    private var count: Int = 0
    private var currentPlayer: String = ""
    private var currentName: String = ""


    private var winningConditions: Boolean = false
    private var text: String = "text"

    companion object {
        private const val X_TEXT = "✘"
        private const val O_TEXT = "\uD835\uDCDE"
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

        if(currentPlayer == X_TEXT){
            turnView.setTextColor(getColor(R.color.lime))
        }else{
            turnView.setTextColor(getColor(R.color.coral))
        }

        grid0 = findViewById<TextView>(R.id.btn0)
        grid1 = findViewById<TextView>(R.id.btn1)
        grid2 = findViewById<TextView>(R.id.btn2)
        grid3 = findViewById<TextView>(R.id.btn3)
        grid4 = findViewById<TextView>(R.id.btn4)
        grid5 = findViewById<TextView>(R.id.btn5)
        grid6 = findViewById<TextView>(R.id.btn6)
        grid7 = findViewById<TextView>(R.id.btn7)
        grid8 = findViewById<TextView>(R.id.btn8)

        resetGame = findViewById<Button>(R.id.btnResetGame)
    }

    init{
        myRandom()
    }

    public fun onResetGameInGrid(view: View) {
        reset = true
        flag = false
        loadDefaultState()
        resetGame.setVisibility(View.INVISIBLE)
    }

    public fun onBtn0(view: View) {
        val grid: gridInfo = gridInfoList.get(0)
        if (grid.text == "" && flag) {
            reset = false
            grid0.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid0.setTextColor(getColor(R.color.lime))
            }else{
                grid0.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn1(view: View) {
        val grid: gridInfo = gridInfoList.get(1)
        if (grid.text == "" && flag) {
            reset = false
            grid1.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid1.setTextColor(getColor(R.color.lime))
            }else{
                grid1.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn2(view: View) {
        val grid: gridInfo = gridInfoList.get(2)
        if (grid.text == "" && flag) {
            reset = false
            grid2.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid2.setTextColor(getColor(R.color.lime))
            }else{
                grid2.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn3(view: View) {
        val grid: gridInfo = gridInfoList.get(3)
        if (grid.text == "" && flag) {
            reset = false
            grid3.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid3.setTextColor(getColor(R.color.lime))
            }else{
                grid3.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn4(view: View) {
        val grid: gridInfo = gridInfoList.get(4)
        if (grid.text == "" && flag) {
            reset = false
            grid4.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid4.setTextColor(getColor(R.color.lime))
            }else{
                grid4.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn5(view: View) {
        val grid: gridInfo = gridInfoList.get(5)
        if (grid.text == "" && flag) {
            reset = false
            grid5.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid5.setTextColor(getColor(R.color.lime))
            }else{
                grid5.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn6(view: View) {
        val grid: gridInfo = gridInfoList.get(6)
        if (grid.text == "" && flag) {
            reset = false
            grid6.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid6.setTextColor(getColor(R.color.lime))
            }else{
                grid6.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn7(view: View) {
        val grid: gridInfo = gridInfoList.get(7)
        if (grid.text == "" && flag) {
            reset = false
            grid7.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid7.setTextColor(getColor(R.color.lime))
            }else{
                grid7.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            flag = false
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    public fun onBtn8(view: View) {
        val grid: gridInfo = gridInfoList.get(8)
        if (grid.text == "" && flag) {
            reset = false
            grid8.text = currentPlayer
            grid.text = currentPlayer
            if(grid.text == X_TEXT){
                grid8.setTextColor(getColor(R.color.lime))
            }else{
                grid8.setTextColor(getColor(R.color.coral))
            }
            count++
            winningConditions()
            changeCurrentPlayer()
            changeTurn()
            if (count < 9) {
                humanVSComp()
            }
        }
    }

    private fun humanVSComp() {
        resetGame.setVisibility(View.VISIBLE)
        if (onePlayerGame == "1") {
            text = "text"
            if (currentName == "Computer") {
                while (text != "") {
                    randomValue = rand(0, 8)
                    val grid: gridInfo = gridInfoList.get(randomValue)
                    if (grid.text == "") {
                        count++
                        Handler(Looper.getMainLooper()).postDelayed({
                            if(!reset) {
                                flag = true
                                grid.text = currentPlayer
                                setText()
                                changeCurrentPlayer()
                                changeTurn()
                            }
                        }, 1000)
                        text = ""
                    }
                }
            }
        } else {
            if(!reset){
                flag = true
            }
        }
    }
    private  fun setText(){
        var i = 0
        while (i < 9) {
            if(reset){
                break
            }
            val grid: gridInfo = gridInfoList.get(i)
            if (grid0.text == "" && i == 0) {
                grid0.text = grid.text
                if(grid.text == X_TEXT){
                    grid0.setTextColor(getColor(R.color.lime))
                }else{
                    grid0.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid1.text == "" && i == 1) {
                grid1.text = grid.text
                if(grid.text == X_TEXT){
                    grid1.setTextColor(getColor(R.color.lime))
                }else{
                    grid1.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid2.text == "" && i == 2) {
                grid2.text = grid.text
                if(grid.text == X_TEXT){
                    grid2.setTextColor(getColor(R.color.lime))
                }else{
                    grid2.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid3.text == "" && i == 3) {
                grid3.text = grid.text
                if(grid.text == X_TEXT){
                    grid3.setTextColor(getColor(R.color.lime))
                }else{
                    grid3.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid4.text == "" && i == 4) {
                grid4.text = grid.text
                if(grid.text == X_TEXT){
                    grid4.setTextColor(getColor(R.color.lime))
                }else{
                    grid4.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid5.text == "" && i == 5) {
                grid5.text = grid.text
                if(grid.text == X_TEXT){
                    grid5.setTextColor(getColor(R.color.lime))
                }else{
                    grid5.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid6.text == "" && i == 6) {
                grid6.text = grid.text
                if(grid.text == X_TEXT){
                    grid6.setTextColor(getColor(R.color.lime))
                }else{
                    grid6.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid7.text == "" && i == 7) {
                grid7.text = grid.text
                if(grid.text == X_TEXT){
                    grid7.setTextColor(getColor(R.color.lime))
                }else{
                    grid7.setTextColor(getColor(R.color.coral))
                }
            }
            if (grid8.text == "" && i == 8) {
                grid8.text = grid.text
                if(grid.text == X_TEXT){
                    grid8.setTextColor(getColor(R.color.lime))
                }else{
                    grid8.setTextColor(getColor(R.color.coral))
                }
            }
            i++
        }
        winningConditions()
    }
    private fun rand(start: Int, end: Int): Int {
        return Random(System.nanoTime()).nextInt(start, end + 1)
    }

    private fun myRandom() {
        if (!random) {
            randomValue = rand(0, 1)
            if (randomValue == 1) {
                currentPlayer = X_TEXT
            } else {
                currentPlayer = O_TEXT
            }
        }
        random = true
    }

    private fun changeCurrentPlayer() {
        if (!winningConditions && currentPlayer == X_TEXT ) {
            currentPlayer = O_TEXT
        } else {
            currentPlayer = X_TEXT
        }
    }

    private fun changeTurn() {
        if ( !winningConditions && count < 9) {
            if (currentName == name1.toString()) {
                if(currentPlayer == X_TEXT){
                    turnView.setTextColor(getColor(R.color.lime))
                }else{
                    turnView.setTextColor(getColor(R.color.coral))
                }
                if (name2 == null) {
                    name2 = "Computer"
                }
                flag = false
                currentName = name2.toString()
            } else {
                if(currentPlayer == X_TEXT){
                    turnView.setTextColor(getColor(R.color.lime))
                }else{
                    turnView.setTextColor(getColor(R.color.coral))
                }
                currentName = name1.toString()
            }
            turnView.setText(currentName + "'s turn")
        } else {
            winningConditions()
        }
    }

    private fun loadDefaultState() {
        turnView.setTextColor(getColor(R.color.white))
        turnView.setText("Please wait for a sec")
        Handler(Looper.getMainLooper()).postDelayed({
            count = 0
            var i = 0
            while (i < 9) {
                val grid: gridInfo = gridInfoList.get(i)
                grid.text = ""
                i++
            }
            currentName = name1.toString()
            turnView.setText(currentName + "'s turn")
            flag = true
        }, 1000)

        grid0.text = ""
        grid1.text = ""
        grid2.text = ""
        grid3.text = ""
        grid4.text = ""
        grid5.text = ""
        grid6.text = ""
        grid7.text = ""
        grid8.text = ""
        random = false
        winningConditions = false
        myRandom()
        if(currentPlayer == X_TEXT){
            turnView.setTextColor(getColor(R.color.lime))
        }else{
            turnView.setTextColor(getColor(R.color.coral))
        }

    }

    private fun winningConditions(){
        turnView.setTextColor(getColor(R.color.khaki))
        if((grid0.text == grid1.text  && grid0.text === grid2.text) ||  (grid0.text == grid3.text && grid0.text == grid6.text) || (grid0.text == grid4.text && grid0.text == grid8.text)){
            if(grid0.text == currentPlayer){
                reset = true
                turnView.setText(currentPlayer + " (${currentName})" + " Won!")
                flag = false
                winningConditions = true
            }
        }
        else if((grid3.text == grid4.text  && grid3.text === grid5.text)){
            if(grid3.text == currentPlayer){
                reset = true
                turnView.setText(currentPlayer + " (${currentName})" + " Won!")
                flag = false
                winningConditions = true
            }
        }
        else if((grid6.text == grid7.text  && grid6.text === grid8.text) ||  (grid6.text == grid4.text && grid6.text == grid2.text)){
            if(grid6.text == currentPlayer){
                reset = true
                turnView.setText(currentPlayer + " (${currentName})" + " Won!")
                flag = false
                winningConditions = true
            }
        }
        else if((grid1.text == grid4.text  && grid1.text === grid7.text)){
            if(grid1.text == currentPlayer){
                reset = true
                turnView.setText(currentPlayer + " (${currentName})" + " Won!")
                flag = false
                winningConditions = true
            }
        }
        else if((grid2.text == grid5.text)  && (grid2.text == grid8.text)){
            if(grid2.text == currentPlayer){
                turnView.setText(currentPlayer + " (${currentName})" + " Won!")
                reset = true
                flag = false
                winningConditions = true
            }
        }
        if(count > 8 && !winningConditions){
            gameOver()
        }
    }
    private fun gameOver(){
        Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show()
        turnView.setText("\uD835\uDD3E\uD835\uDD52\uD835\uDD5E\uD835\uDD56 \uD835\uDD4B\uD835\uDD5A\uD835\uDD56\uD835\uDD55!")
    }
}