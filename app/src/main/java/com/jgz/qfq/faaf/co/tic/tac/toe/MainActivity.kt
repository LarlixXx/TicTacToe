package com.jgz.qfq.faaf.co.tic.tac.toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count:Int = 1
    var w1:Int = 0
    var w2:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        val btnNewGame = findViewById<Button>(R.id.new_game)



        fun replace(){
            btn1.setText("")
            btn2.setText("")
            btn3.setText("")
            btn4.setText("")
            btn5.setText("")
            btn6.setText("")
            btn7.setText("")
            btn8.setText("")
            btn9.setText("")
            btn1.setEnabled(true)
            btn2.setEnabled(true)
            btn3.setEnabled(true)
            btn4.setEnabled(true)
            btn5.setEnabled(true)
            btn6.setEnabled(true)
            btn7.setEnabled(true)
            btn8.setEnabled(true)
            btn9.setEnabled(true)
            count = 1
        }
        btnNewGame.setOnClickListener { replace() }
        fun checkk(){
            if((btn1.text=="X" && btn5.text == "X" && btn9.text=="X") || (btn3.text=="X" && btn5.text == "X" && btn7.text=="X")|| (btn1.text=="X" && btn2.text == "X" && btn3.text=="X")|| (btn3.text=="X" && btn6.text == "X" && btn9.text=="X")|| (btn7.text=="X" && btn8.text == "X" && btn9.text=="X")|| (btn1.text=="X" && btn4.text == "X" && btn7.text=="X")|| (btn2.text=="X" && btn5.text == "X" && btn8.text=="X")|| (btn4.text=="X" && btn5.text == "X" && btn6.text=="X")){
                replace()
                w1+=1
                val text = "Player 1 WIN\n $w1 : $w2"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
            if((btn1.text=="O" && btn5.text == "O" && btn9.text=="O") || (btn3.text=="O" && btn5.text == "O" && btn7.text=="O")|| (btn1.text=="O" && btn2.text == "O" && btn3.text=="O")|| (btn3.text=="O" && btn6.text == "O" && btn9.text=="O")|| (btn7.text=="O" && btn8.text == "O" && btn9.text=="O")|| (btn1.text=="O" && btn4.text == "O" && btn7.text=="O")|| (btn2.text=="O" && btn5.text == "O" && btn8.text=="O")|| (btn4.text=="O" && btn5.text == "O" && btn6.text=="O")){
                replace()
                w2+=1
                val text = "Player 2 WIN\n $w1 : $w2"
                val duration = Toast.LENGTH_SHORT

                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
            }
        }


        btn1.setOnClickListener {
            if(count==1){
                btn1.setText("X")
                btn1.setEnabled(false)
                count = 2
            }
            else{
                btn1.setText("O")
                btn1.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn2.setOnClickListener {
            if(count==1){
                btn2.setText("X")
                btn2.setEnabled(false)
                count = 2
            }
            else{
                btn2.setText("O")
                btn2.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn3.setOnClickListener {
            if(count==1){
                btn3.setText("X")
                btn3.setEnabled(false)
                count = 2
            }
            else{
                btn3.setText("O")
                btn3.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn4.setOnClickListener {
            if(count==1){
                btn4.setText("X")
                btn4.setEnabled(false)
                count = 2
            }
            else{
                btn4.setText("O")
                btn4.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn5.setOnClickListener {
            if(count==1){
                btn5.setText("X")
                btn5.setEnabled(false)
                count = 2
            }
            else{
                btn5.setText("O")
                btn5.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn6.setOnClickListener {
            if(count==1){
                btn6.setText("X")
                btn6.setEnabled(false)
                count = 2
            }
            else{
                btn6.setText("O")
                btn6.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn7.setOnClickListener {
            if(count==1){
                btn7.setText("X")
                btn7.setEnabled(false)
                count = 2
            }
            else{
                btn7.setText("O")
                btn7.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn8.setOnClickListener {
            if(count==1){
                btn8.setText("X")
                btn8.setEnabled(false)
                count = 2
            }
            else{
                btn8.setText("O")
                btn8.setEnabled(false)
                count = 1
            }
            checkk()
        }

        btn9.setOnClickListener {
            if(count==1){
                btn9.setText("X")
                btn9.setEnabled(false)
                count = 2
            }
            else{
                btn9.setText("O")
                btn9.setEnabled(false)
                count = 1
            }
            checkk()

        }




    }
}