// Main.kt

fun main() {
    println("Calculadora de IMC")

    // Solicitar o peso do usuário
    print("Digite seu peso (kg): ")
    val peso = readLine()?.toDoubleOrNull()

    // Solicitar a altura do usuário
    print("Digite sua altura (m): ")
    val altura = readLine()?.toDoubleOrNull()

    // Verificar se os dados são válidos
    if (peso != null && altura != null) {
        // Criar uma instância da classe IMC
        val calculadoraIMC = IMC(peso, altura)

        // Calcular o IMC e obter a categoria
        val imc = calculadoraIMC.calcularIMC()
        val categoria = calculadoraIMC.categoriaIMC()

        // Exibir o IMC e a categoria
        println("Seu IMC é: %.2f".format(imc))
        println("Categoria: $categoria")
    } else {
        println("Dados inválidos. Por favor, insira valores válidos.")
    }
}


