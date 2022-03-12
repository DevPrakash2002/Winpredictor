package com.example.winpridictor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var leftScore:Int=0
    var rightScore:Int=0
    var hasBeenClicked:Boolean=false
    var leftRoundScore:Int=0
    var rightRoundScore:Int=0
    var namea:String=""
    var nameb:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun leftClickA(view : View) {

       if (hasBeenClicked==false) {
        var editTextRightTop = findViewById<EditText>(R.id.editTextRightTop)
        var TextRightTop = findViewById<TextView>(R.id.textRightTop)
        TextRightTop.setText(editTextRightTop.text)
            var namea=(editTextRightTop.text)
        editTextRightTop.setText(" ")
        var editTextLeftTop = findViewById<EditText>(R.id.editTextLeftTop)
        var TextLeftTop = findViewById<TextView>(R.id.textLeftTop)
        TextLeftTop.setText(editTextLeftTop.text)

        editTextLeftTop.setText(" ")
    }
        hasBeenClicked=true
        var TextLeftBottom=findViewById<TextView>(R.id.textLeftBottom)
        leftScore++
        if (leftScore<=11){

        TextLeftBottom.setText("$leftScore")

            if (leftScore==11&&(leftScore-2)>=rightScore)
            {
                leftRoundScore++
            var TextScore=findViewById<TextView>(R.id.textScore)
                TextScore.setText("$leftRoundScore - $rightRoundScore")
                reset()
            }

                var Winner=findViewById<TextView>(R.id.textWinner)
                var TextLeftTop=findViewById<TextView>(R.id.textLeftTop)
               Winner.setText(TextLeftTop.text)

                var per:Int=0
                per=(leftRoundScore*100)/5

                Winner.setText("PLayer1 \nWinning Percentage:$per %")

        }


    }
    fun rightClick(view: View){
        if (hasBeenClicked==false) {
            var editTextRightTop = findViewById<EditText>(R.id.editTextRightTop)
            var TextRightTop = findViewById<TextView>(R.id.textRightTop)
            TextRightTop.setText(editTextRightTop.text)
            editTextRightTop.setText(" ")
            var editTextLeftTop = findViewById<EditText>(R.id.editTextLeftTop)
            var TextLeftTop = findViewById<TextView>(R.id.textLeftTop)
            TextLeftTop.setText(editTextLeftTop.text)
            editTextLeftTop.setText(" ")
        }
        hasBeenClicked=true
        rightScore++
        var TextRightBottom=findViewById<TextView>(R.id.textRightBottom)
        if (rightScore<=11){

            TextRightBottom.setText("$rightScore")

            if (rightScore==11&&(rightScore-2)>=leftScore)
            {
                rightRoundScore++
                var TextScore=findViewById<TextView>(R.id.textScore)
                TextScore.setText("$leftRoundScore - $rightRoundScore")
                reset()
            }

                var Winner=findViewById<TextView>(R.id.textWinner)
                var TextRightTop=findViewById<TextView>(R.id.textRightTop)
                Winner.setText(TextRightTop.text)

                var per:Int=0
                per=(rightRoundScore*100)/5
                Winner.setText("Player2 \nWinning Percentage:$per %")

        }
    }
    fun clickReset(view: View){
        hasBeenClicked=false
        rightScore=0
        leftScore=0
        var editTextRightTop=findViewById<EditText>(R.id.editTextRightTop)
        editTextRightTop.setText("Player2")
        var editTextLeftTop=findViewById<EditText>(R.id.editTextLeftTop)
        editTextLeftTop.setText("Player1")
        var TextRightBottom=findViewById<TextView>(R.id.textRightBottom)
        TextRightBottom.setText("$rightScore")
        var TextLeftBottom=findViewById<TextView>(R.id.textLeftBottom)
        TextLeftBottom.setText("$leftScore")
        var Winner=findViewById<TextView>(R.id.textWinner)
        Winner.setText(" ")
        var TextScore=findViewById<TextView>(R.id.textScore)
        TextScore.setText(" ")
        var TextRightTop = findViewById<TextView>(R.id.textRightTop)
        TextRightTop.setText(" ")
        var TextLeftTop = findViewById<TextView>(R.id.textLeftTop)
        TextLeftTop.setText(" ")

    }
    fun reset(){
        leftScore=0
        rightScore=0
        var TextLeftBottom=findViewById<TextView>(R.id.textLeftBottom)
        var TextRightBottom=findViewById<TextView>(R.id.textRightBottom)
        TextLeftBottom.setText("$leftScore")
        TextRightBottom.setText("$rightScore")
    }
    fun winner(){
        if(leftRoundScore==5) {
            var editTextLeftTop=findViewById<EditText>(R.id.editTextLeftTop)
            var Winner=findViewById<TextView>(R.id.textWinner)
            Winner.setText(editTextLeftTop.text)
            var per:Int=0
            per=(leftRoundScore*100)/5
            print("\nWinning Percentage:$per %")
        }
        else if(rightRoundScore==5){
            var editTextRightTop=findViewById<EditText>(R.id.editTextRightTop)
            var Winner=findViewById<TextView>(R.id.textWinner)
            Winner.setText(editTextRightTop.text)
            var per:Int=0
            per=(rightRoundScore*100)/5
            print("\nWinning Percentage:$per %")
        }
    }

}
