package dam_a51827.helloworldoption

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.os.Build
import android.widget.TextView

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

        //O R é uma classe para aceder a todos os recursos
        val deviceInfo = findViewById<TextView>(R.id.deviceInfo)

        val info = getString(
            R.string.device_info_template,
            Build.MANUFACTURER,
            Build.MODEL,
            Build.BRAND,
            Build.TYPE,
            Build.USER,
            Build.VERSION.BASE_OS,
            Build.VERSION.INCREMENTAL,
            Build.VERSION.SDK_INT,
            Build.VERSION.RELEASE,
            Build.DISPLAY
        )

        deviceInfo.text = info
    }


}