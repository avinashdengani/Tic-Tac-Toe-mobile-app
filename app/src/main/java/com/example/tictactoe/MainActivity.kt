package com.example.tictactoe

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun onStartGame(view:View){

    }
    public fun onHowToPlay(view:View){
        val customDialog = Dialog(this)

        customDialog.setContentView(R.layout.custom_dialog_box)

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