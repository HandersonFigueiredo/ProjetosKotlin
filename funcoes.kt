fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWhitPrefix(message: String, prefix: String = "Atenção!"){
    println("<<$prefix>>, $message")
}

fun soma(x: Int, y: Int): Int {
    return x + y
}

fun mutiply(x: Int, y: Int) = x * y

fun main(){
    printMessage("Ola Mundão")
    printMessageWhitPrefix("Isso é um Teste de Função.")
    printMessageWhitPrefix("Hello", "Log")
    printMessageWhitPrefix("Hello")
    printMessageWhitPrefix(prefix = "Log", message = "Hello")
    println("O Resultado da SOMA é = " + soma (5, 25))
    println("0 Resultado da MULTIPLICAÇÃO é = " + mutiply(5, 10))

}