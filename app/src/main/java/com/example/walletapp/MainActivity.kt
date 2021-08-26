package com.example.walletapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    lateinit var AppView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppView = findViewById(R.id.rvapp)
    }

    var intent = Intent(context, com.example.walletapp.display::class.java)
    context.startActivity(intent)


}

  var rvnumbers=findViewById<RecyclerView>(R.id.rvapp)
  rvapp.layoutManager=LinearLayoutManager(baseContext)
   var appViewHolder=WalletRecyclerViewAdapter()
   rvnumbers.adapter=numbersAdapter
}
}


