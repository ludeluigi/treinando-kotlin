fun main() {
    println("Bem-Vindo à Calculadora Básica em Kotlin!")
    println("Escolha uma operação: +, -, *, /")
    val operacao = readLine()

    println("Primeiro Numero:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Segundo Numero: ")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        val resultado = when (operacao) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) {
                    num1 / num2
                }   else {
                    println("Erro: Divisão por zero não permitida!")
                    return
                }

            }
            else -> {
                println("Operação Inválida")
                return
            }
        }

        println("Resultado: $num1 $operacao $num2 = $resultado")
    } else {
        println("Erro: Entrada inválida. Digite números válidos!")
    }
}