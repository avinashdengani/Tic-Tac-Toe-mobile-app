package com.example.tictactoe

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    companion object{
        private const val ONE_PLAYER_GAME = "1"
        private  const val TWO_PLAYER_GAME = "2"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun onStartGame(view:View){
        val customDialog = Dialog(this)

        customDialog.setContentView(R.layout.start_game_dialog_box)

        customDialog.findViewById<TextView>(R.id.btnOnePlayer).setOnClickListener(View.OnClickListener {
            val name1 = findViewById<TextInputEditText>(R.id.txtName1).text.toString()
            if(name1.isEmpty() ){
                Toast.makeText(this,"Player 1 name is Compulsory", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, MainGrid::class.java)
                intent.putExtra(Constants.PLAYER1, name1)
                intent.putExtra(Constants.ONE_PLAYER_GAME, ONE_PLAYER_GAME)
                startActivity(intent)
                finish()
            }
            customDialog.dismiss()
        })

        customDialog.findViewById<Button>(R.id.btnTwoPlayer).setOnClickListener(View.OnClickListener {
            val name1 = findViewById<TextInputEditText>(R.id.txtName1).text.toString()
            var name2 = findViewById<TextInputEditText>(R.id.txtName2).text.toString()
            if(name1.isEmpty() ){
                Toast.makeText(this,"Player 1 name is Compulsory", Toast.LENGTH_SHORT).show()
            }else{
                if(name2.isEmpty()){
                    name2 = "Player 2"
                }
                val intent = Intent(this, MainGrid::class.java)
                intent.putExtra(Constants.PLAYER1, name1)
                intent.putExtra(Constants.PLAYER2, name2)
                intent.putExtra(Constants.TWO_PLAYER_GAME, TWO_PLAYER_GAME)
                startActivity(intent)
                finish()
            }
            customDialog.dismiss()
        })

        customDialog.findViewById<Button>(R.id.btnCloseDialogBox).setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "oops! It seems that you have cancelled game to Begin!", Toast.LENGTH_SHORT).show()
            customDialog.dismiss()
        })
        customDialog.setCancelable(false)
        customDialog.show()
    }
    public fun onHowToPlay(view:View){
        val customDialog = Dialog(this)

        customDialog.setContentView(R.layout.how_to_play_dialog_box)

        customDialog.findViewById<TextView>(R.id.tvOkay).setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "You  saw How to Play now start Playing!", Toast.LENGTH_SHORT).show()
            customDialog.dismiss()
        })

        customDialog.findViewById<Button>(R.id.btnCloseDialogBox).setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "You saw How to Play now start Playing!", Toast.LENGTH_SHORT).show()
            customDialog.dismiss()
        })

        customDialog.setCancelable(false)
        customDialog.show()
    }
}