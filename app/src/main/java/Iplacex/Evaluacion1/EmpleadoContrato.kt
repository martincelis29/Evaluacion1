package Iplacex.Evaluacion1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EmpleadoContratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empleado_contrato)

        val btnVolver = findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val etSueldo = findViewById<EditText>(R.id.etSueldo)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        btnCalcular.setOnClickListener {
            val sueldo = etSueldo.text.toString().toDoubleOrNull() ?: 0.0
            val empleadoContrato = EmpleadoContrato(sueldo)
            val sueldoLiquido = empleadoContrato.calcularLiquido()
            tvResultado.text = "El sueldo es de $sueldoLiquido"
        }
    }
}