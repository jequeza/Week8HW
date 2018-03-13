package edu.rvc.student.week8hw

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtNameshow = findViewById<TextView>(R.id.txtNameShow)
        val txtPhoneshow = findViewById<TextView>(R.id.txtPhoneShow)
        val txtEmailshow = findViewById<TextView>(R.id.txtEmailShow)

        var strNameShow: String = intent.getStringExtra("SendName")
        txtNameshow.text = strNameShow

        var strPhoneShow: String = intent.getStringExtra("SendPhone")
        txtPhoneshow.text = strPhoneShow

        var strEmailShow: String = intent.getStringExtra("SendEmail")
        txtEmailshow.text = strEmailShow


    }
}
