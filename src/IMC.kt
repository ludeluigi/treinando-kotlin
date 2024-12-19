class IMC (val peso: Double, val altura: Double) {
    fun calcularIMC(): Double {
        return peso / (altura * altura)
    }

    fun categoriaIMC(): String {
        val imc = calcularIMC()
        return  when {
            imc < 18.5 -> "Abaixo do peso"
            imc in 18.5..24.9 -> "no peso normal"
            imc in 25.0..29.9 -> "Sobrepeso"

            else -> "Obesidade"
        }
    }
}