package Iplacex.Evaluacion1

// Clase Empleado
abstract class Empleado(val sueldoBruto: Double) {
    abstract fun calcularLiquido(): Double
}

// Subclase Empleado Honorarios
class EmpleadoHonorarios(montoBruto: Double) : Empleado(montoBruto) {
    override fun calcularLiquido(): Double = sueldoBruto * 0.87 // 13% de retención
}

// Subclase Empleado Contrato
class EmpleadoContrato(montoBruto: Double) : Empleado(montoBruto) {
   override fun calcularLiquido(): Double = sueldoBruto * 0.80 // 20% de retención
}