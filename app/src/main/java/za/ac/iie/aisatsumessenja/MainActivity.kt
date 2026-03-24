package za.ac.iie.aisatsumessenja

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Declarartions
        val etTimeOfDay = findViewById<EditText>(R.id.etTimeofDay)
        val btnBoom = findViewById<Button>(R.id.btnBoom)
        val btnOops = findViewById<Button>(R.id.btnOops)
        val tvResult = findViewById<TextView>(R.id.tvResult)


        btnBoom.setOnClickListener {
var result = ""
            if (etTimeOfDay.text.toString().isEmpty()) {
                tvResult.text = "FILL OUT THE TIME OF DAY SENPAI!!!!"

            } else if  (etTimeOfDay.text.toString().lowercase() == "morning") {
                result = "OHAYO!!!Here are your suggestions..." +
                        " \n 1. send a good morning message to your mother and father." +
                        " \n 2.send a good morning message to friends and colleagues" +
                        "\n 3.wish the people in your close contact a good day" +
                        "\n 4.take a morning run to clear your head"

                tvResult.text = "$result"
            } else if (etTimeOfDay.text.toString().lowercase() == "afternoon"){
                        result = "KON'NICHIWA!!here are your suggestions" +
                                "\n 1. Ask everyone what they are having for lunch" +
                                "\n 2. take a break SENPAI,you are working too hard" +
                                "\n 3.Check in with your TOMODACHI...are they okay? "
                tvResult.text = "$result"

                    }else if (etTimeOfDay.text.toString().lowercase() == "night time"){
                        result= "MO YORUDESU KA?....well here are your suggestions for the night" +
                                "\n 1.Send a good night message to your mom and dad" +
                                "\n 2. Tell your friends about your day" +
                                "\n 3.pray before bed."
                tvResult.text= "$result"
                    }else {
                result = "SUSSY SUKANA BAKA...WRONG INPUT" +
                        "\n Please enter (morning/afternoon/night time)"
                tvResult.text= "$result"
            }

        }

        btnOops.setOnClickListener {
            if (etTimeOfDay.text.toString().isNotEmpty() && tvResult.text.toString().isNotEmpty()){
                etTimeOfDay.setText("")
            tvResult.text = ""
            }
            else if (etTimeOfDay.text.toString().isNotEmpty() || tvResult.text.toString().isNotEmpty()){
                etTimeOfDay.setText("")
                tvResult.text = ""
            }

        }























    }
}

































