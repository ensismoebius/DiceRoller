package org.dedira.diceroller

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {

    private lateinit var txtCurrentNickname: TextView
    private lateinit var txtNickname: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        txtCurrentNickname = findViewById(R.id.txtCurrentNickname)
        txtNickname = findViewById(R.id.txtNickname)

        findViewById<Button>(R.id.btnDone).setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        txtCurrentNickname.text = txtNickname.text
        txtNickname.visibility = View.GONE
        view.visibility = View.GONE
        txtCurrentNickname.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}