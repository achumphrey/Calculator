package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // No need to do a findViewById to get a reference
        // to a view component. Also there is no need to
        // use the setText() and getText() methods to set and
        // get texts. Simply use the view id chain to text, eg.
        // view_id.text. This is another way of using the setter
        // while view_id.text.toString() is the getter. See examples below.

        btn_save.setOnClickListener {
        tv_user_name.text = "Hello ${et_name.text.toString()}!"
        }

        btn_add.setOnClickListener {
            var a: Int = et_number_one.text.toString().toInt()
            var b: Int = et_number_two.text.toString().toInt()
            tv_result.text = (a + b).toString()
        }

        btn_multiply.setOnClickListener {
            var a: Int = et_number_one.text.toString().toInt()
            var b: Int = et_number_two.text.toString().toInt()
            tv_result.text = (a * b).toString()
        }

        btn_subtract.setOnClickListener {
            var a: Int = et_number_one.text.toString().toInt()
            var b: Int = et_number_two.text.toString().toInt()
            tv_result.text = (a - b).toString()
        }

        btn_divide.setOnClickListener {
            var a: Int = et_number_one.text.toString().toInt()
            var b: Int = et_number_two.text.toString().toInt()
            var db: Double = b.toDouble()

            if (db.equals(0)) {
                tv_result.text = "Er!"
            }else{
                tv_result.text = String.format("%.2f", (a/db))
            }
        }
    }
}
