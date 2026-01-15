package id.antasari.p1helloworldapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var isFirstText = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Membungkus pencarian view setelah setContentView
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnToggle = findViewById<Button>(R.id.btnToggle)

        btnToggle.setOnClickListener {
            if (isFirstText) {
                tvMessage.text = "Selamat Datang di Perkuliahan Mobile Programming"
                isFirstText = false
            } else {
                tvMessage.text = "Halo 230104040127"
                isFirstText = true
            }
        }
    }
}