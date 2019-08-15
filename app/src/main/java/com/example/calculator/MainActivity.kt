package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View?) {
        var num: String = ""
        var a = 0
        var b = 0

        if (et_number_one.text.toString().isEmpty() || et_number_two.text.toString().isEmpty()) {

            num = "Er!"
            tv_result.text = num

        } else {
            a = Integer.parseInt(et_number_one.text.toString())
            b = Integer.parseInt(et_number_two.text.toString())

            when (view!!.id) {

                R.id.btn_add -> num = (a + b).toString()

                R.id.btn_subtract -> num = (a - b).toString()

                R.id.btn_multiply -> num = (a * b).toString()

                R.id.btn_divide -> {

                    var db: Double = b.toDouble()

                    if (db.equals(0.0)) {
                        num = "Er!"
                    } else {
                        num = String.format("%.2f", (a / db))
                    }
                }
            }//END WHEN
            tv_result.text = num
        }//END ELSE
    }//END ONCLICK


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_divide.setOnClickListener(this)
        btn_add.setOnClickListener(this)
        btn_subtract.setOnClickListener(this)
        btn_multiply.setOnClickListener(this)

        btn_save.setOnClickListener {
            tv_user_name.text = "Hello ${et_name.text.toString()}!"
        }
    }
}

// No need to do a findViewById to get a reference
// to a view component. Also there is no need to
// use the setText() and getText() methods to set and
// get texts. Simply use the view id chain to text, eg.
// view_id.text. This is another way of using the setter
// while view_id.text.toString() is the getter. See examples below.
