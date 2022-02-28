package com.example.handleclickofmultiplebutton

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun onclick(view: View) {
        if(view.id==R.id.btnAlert)
        {
            var builder=AlertDialog.Builder(this)
            builder.setTitle("Alert box")
            builder.setMessage("click yes or no!")

            //handle click event
            //1
            builder.setPositiveButton("yes", DialogInterface.OnClickListener
            { dialogInterface, i ->
                Toast.makeText(this,"yes click",Toast.LENGTH_SHORT).show()
            })
            //2
            builder.setNegativeButton("no",DialogInterface.OnClickListener
            { dialogInterface, i ->
                Toast.makeText(this,"no click",Toast.LENGTH_SHORT).show()
            })

            builder.setIcon(R.drawable.ic_launcher_background)

            //create alert dialog box
            var Alert=builder.create()

            //specifi complasury select one option than leave the dialog box
            Alert.setCancelable(false)

            //display the dialog box
            Alert.show()
        }
        else if(view.id==R.id.btnsecond)
        {
            Toast.makeText(this,"second btn click",Toast.LENGTH_SHORT).show()
        }
    }
}