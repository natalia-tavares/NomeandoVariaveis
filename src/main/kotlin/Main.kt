fun main(args: Array<String>) {

    var nome = ""
    var idade = 0
    var emprego = ""
    var nacionalidade = ""
    var sangue = ""
    var ano = 0

    println("Digite seu nome: ")
    nome = readLine()!!
    println("Digite a sua idade: ")
    idade = readLine()!!.toInt()
    println("Digite qual profissão deseja seguir: ")
    emprego= readLine()!!
    println("Digite a sua nacionalidade: ")
    nacionalidade= readLine()!!
    println("Digite o seu tipo sanguineo: ")
    sangue= readLine()!!

    ano = 2021 - idade

    println("Seu nome é $nome, tem $idade anos de idade e quer ser $emprego. Sua nacionalidade é $nacionalidade ." +
            " Seu tipo sanguineo é $sangue e você nasceu no ano de $ano")
}