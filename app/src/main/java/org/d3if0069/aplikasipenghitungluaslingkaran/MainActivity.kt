package org.d3if0069.aplikasipenghitungluaslingkaran

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var lengthEditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lengthEditText = findViewById(R.id.lengthEditText)
        resultTextView = findViewById(R.id.resultTextView)
    }

    fun calculateArea(view: View) {
        val length = lengthEditText.text.toString().toDouble()
        val area = length * length
        resultTextView.text = "Luas persegi = ${"%.2f".format(area)}"
    }
}
