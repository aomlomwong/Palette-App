package th.ac.su.ict.wongworrawan.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var colorView = findViewById<TextView>(R.id.colorView)
        val buttonColor1 = findViewById<Button>(R.id.colorButton1)
        val buttonColor2 = findViewById<Button>(R.id.colorButton2)
        val buttonColor3 = findViewById<Button>(R.id.colorButton3)
        val buttonColor4 = findViewById<Button>(R.id.colorButton4)
        val buttonColor5 = findViewById<Button>(R.id.colorButton5)
        val buttonColor6 = findViewById<Button>(R.id.colorButton6)

        var color1:String = ""



        buttonColor1.setOnClickListener()
        {
            colorView.setBackgroundColor(Color.parseColor("#e9e1de"));
            color1 = "233-225-222"
            colorView.text = color1


        }

        buttonColor2.setOnClickListener()
        {
            colorView.setBackgroundColor(Color.parseColor("#e7cccb"));
            color1 = "231-204-203"
            colorView.text = color1

        }

        buttonColor3.setOnClickListener()
        {
            colorView.setBackgroundColor(Color.parseColor("#77839a"));
            color1 = "119-131-154"
            colorView.text = color1
        }

        buttonColor4.setOnClickListener()
        {
            colorView.setBackgroundColor(Color.parseColor("#9ca9bd"));
            color1 = "156-169-189"
            colorView.text = color1
        }

        buttonColor5.setOnClickListener()
        {
            colorView.setBackgroundColor(Color.parseColor("#c4ccd4"));
            color1 = "196-204-212"
            colorView.text = color1
        }

        buttonColor6.setOnClickListener()
        {
            colorView.setBackgroundColor(Color.parseColor("#dee2e5"));
            color1 = "222-226-229"
            colorView.text = color1
        }




    }
}

