package com.example.customdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.customdialog.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
                var builder = AlertDialog.Builder(this)
                var v1 = layoutInflater.inflate(R.layout.custom_dialog, null)
                builder.setView(v1)
                var listener = DialogInterface.OnClickListener { p0, p1 ->
                    var alert = p0 as AlertDialog
                    findViewById<TextView>(R.id.textview).text=alert.findViewById<EditText>(R.id.editText)!!.text
                }
                builder.setPositiveButton("전송", listener)
                builder.setNegativeButton("취소", null)
                builder.show()


        }


    }


}