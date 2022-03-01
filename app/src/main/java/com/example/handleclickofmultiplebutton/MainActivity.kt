package com.example.handleclickofmultiplebutton

import android.app.DatePickerDialog
import android.app.SearchManager
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    override fun onBackPressed() {

        var builder=AlertDialog.Builder(this)
        builder.setTitle("Alert Box")
        builder.setIcon(R.drawable.ic_launcher_background)
        builder.setMessage("are you want to exit?")
        builder.setPositiveButton("yes", DialogInterface.OnClickListener
        { dialogInterface, i ->
            Toast.makeText(this,"good bye",Toast.LENGTH_SHORT).show()
            finish()
        })
        builder.setNegativeButton("no", DialogInterface.OnClickListener { dialogInterface, i ->

            Toast.makeText(this,"ohh! welcome back",Toast.LENGTH_SHORT).show()

        })

        var dialog=builder.create()
        dialog.show()


    }

    @RequiresApi(Build.VERSION_CODES.N)
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
            //var Alert=builder.create()
            builder.create()

            //specifi complasury select one option than leave the dialog box
           // Alert.setCancelable(false)
            builder.setCancelable(false)
            //display the dialog box
            //Alert.show()
            builder.show()
        }
        else if(view.id==R.id.btnsecond)
        {
            Toast.makeText(this,"second btn click",Toast.LENGTH_SHORT).show()
        }
        else if(view.id==R.id.edttime)
        {
            var cal:Calendar= Calendar.getInstance()
            var hour=cal.get(Calendar.HOUR_OF_DAY)
            var minute=cal.get(Calendar.MINUTE)
            var second=cal.get(Calendar.SECOND)

            var time:TimePickerDialog= TimePickerDialog(this,
                TimePickerDialog.OnTimeSetListener(
                    {TimePickerDialog,hour,minute->
                        edttime.setText("$hour:$minute")
                    }
                ),hour,minute,true)
            time.show()

        }
        else if(view.id==R.id.btntime)
        {

            var cal:Calendar= Calendar.getInstance()
            var hour=cal.get(Calendar.HOUR_OF_DAY)
            var minute=cal.get(Calendar.MINUTE)
            var second=cal.get(Calendar.SECOND)


            var time:TimePickerDialog= TimePickerDialog(this,
                TimePickerDialog.OnTimeSetListener(
                    {TimePickerDialog,hour,minute->
                        edttime.setText("$hour:$minute")
                    }
                ),hour,minute,true)
            time.show()

        }
        else if(view.id==R.id.edtdate)
        {
            var cal:Calendar= Calendar.getInstance()

            var Date=cal.get(Calendar.DAY_OF_MONTH)
            var year=cal.get(Calendar.YEAR)
            var month=cal.get(Calendar.MONTH)

            var date:DatePickerDialog= DatePickerDialog(this,DatePickerDialog.OnDateSetListener(
                { DatePickerDialog, year, month, date ->
                    edtdate.setText("$date/$month/$year")
                }
            ),year,month,Date)
            date.show()
        }

        else if(view.id==R.id.btndatepicker)
        {
            var cal:Calendar= Calendar.getInstance()

            var Date=cal.get(Calendar.DAY_OF_MONTH)
            var year=cal.get(Calendar.YEAR)
            var month=cal.get(Calendar.MONTH)





            var date:DatePickerDialog= DatePickerDialog(this,DatePickerDialog.OnDateSetListener(
                { DatePickerDialog, year, month, date ->

                        Toast.makeText(this, "$date/${month + 1}/$year", Toast.LENGTH_SHORT).show()
                        edtdate.setText("$date/${month + 1}/$year")

                }
            ),year,month,Date)
            date.show()


        }
    }
}