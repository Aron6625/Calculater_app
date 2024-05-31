package com.example.myfirtshelloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)
        val b5 = findViewById<Button>(R.id.button5)
        val b6 = findViewById<Button>(R.id.button6)
        val b7 = findViewById<Button>(R.id.button7)
        val b8 = findViewById<Button>(R.id.button8)
        val b9 = findViewById<Button>(R.id.button9)
        val b0 = findViewById<Button>(R.id.button0)
        val bPunto = findViewById<Button>(R.id.buttonPunto)
        val bClear = findViewById<Button>(R.id.buttonClear)
        val bSuma = findViewById<Button>(R.id.buttonSuma)
        val bResta = findViewById<Button>(R.id.buttonResta)
        val bIgual = findViewById<Button>(R.id.buttonIgual)
        val bDivision = findViewById<Button>(R.id.buttonDivision)
        val bMulti = findViewById<Button>(R.id.buttonMulti)

        var numero1 = ""
        var numero2 = ""
        var operacion = ""

        fun listaraumentarnumeros(buttons: String){
            editText1.append(buttons)
        }

        val operationClickListener = { button: Button ->
            numero1 = editText1.text.toString()
            operacion = button.text.toString()
            editText1.text.clear()
        }

        val igualClickListener = {
            numero2 = editText1.text.toString()
            val resultado = when (operacion) {
                "+" -> numero1.toDouble() + numero2.toDouble()
                "-" -> numero1.toDouble() - numero2.toDouble()
                "*" -> numero1.toDouble() * numero2.toDouble()
                "/" -> numero1.toDouble() / numero2.toDouble()
                else -> 0.0
            }
            editText1.setText(resultado.toString())
        }

        val clearClickListener = {
            editText1.text.clear()
            numero1 = ""
            numero2 = ""
            operacion = ""
        }

        b1.setOnClickListener{ listaraumentarnumeros("1")}
        b2.setOnClickListener{ listaraumentarnumeros("2")}
        b3.setOnClickListener{ listaraumentarnumeros("3")}
        b4.setOnClickListener{ listaraumentarnumeros("4")}
        b5.setOnClickListener{ listaraumentarnumeros("5")}
        b6.setOnClickListener{ listaraumentarnumeros("6")}
        b7.setOnClickListener{ listaraumentarnumeros("7")}
        b8.setOnClickListener{ listaraumentarnumeros("8")}
        b9.setOnClickListener{ listaraumentarnumeros("9")}
        b0.setOnClickListener{ listaraumentarnumeros("0")}
        bPunto.setOnClickListener {listaraumentarnumeros (".") }
        bSuma.setOnClickListener { operationClickListener(bSuma) }
        bResta.setOnClickListener { operationClickListener(bResta) }
        bMulti.setOnClickListener { operationClickListener(bMulti) }
        bDivision.setOnClickListener { operationClickListener(bDivision) }
        bIgual.setOnClickListener { igualClickListener() }
        bClear.setOnClickListener { clearClickListener() }
    }
}