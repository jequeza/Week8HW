package edu.rvc.student.week8hw

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaveContact = findViewById<Button>(R.id.btnSave)
        val txtNameContact = findViewById<EditText>(R.id.txtName)
        val txtPhoneContact = findViewById<EditText>(R.id.txtPhone)
        val txtEmailContact = findViewById<EditText>(R.id.txtEmail)

        btnSaveContact.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("SendName", txtNameContact.text.toString())
            intent.putExtra("SendPhone", txtPhoneContact.text.toString())
            intent.putExtra("SendEmail", txtEmailContact.text.toString())
            startActivity(intent)

            hideKeyboard()
        })

    }

    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }

    }
}
