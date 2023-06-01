package `in`.mackdev.dmas

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.textview_result)
        val box_1 = findViewById<EditText>(R.id.textview_box1)
        val box_2 = findViewById<EditText>(R.id.textview_box2)

        val btnadd = findViewById<Button>(R.id.add)
        val btnmul = findViewById<Button>(R.id.mul)
        val btndiv = findViewById<Button>(R.id.div)
        val btnsub = findViewById<Button>(R.id.sub)
        val btnclr = findViewById<Button>(R.id.clearbtn)

        btnadd.setOnClickListener {

            val box_1 = box_1.text.toString().toInt()
            val box_2 = box_2.text.toString().toInt()
            val add = box_1 + box_2

            result.text = add.toString()

        }

        btnmul.setOnClickListener {

            val box_1 = box_1.text.toString().toInt()
            val box_2 = box_2.text.toString().toInt()
            val mul = box_1 * box_2

            result.text = mul.toString()
        }

        btndiv.setOnClickListener {

            val box_1 = box_1.text.toString().toInt()
            val box_2 = box_2.text.toString().toInt()
            val div = box_1 / box_2

            result.text = div.toString()
        }

        btnsub.setOnClickListener {

            val box_1 = box_1.text.toString().toInt()
            val box_2 = box_2.text.toString().toInt()
            val sub = box_1 - box_2

            result.text = sub.toString()
        }

        btnclr.setOnClickListener {
            result.text = ""
            box_1.setText("")
            box_2.setText("")
        }
    }
}