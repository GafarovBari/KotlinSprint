package org.example.lesson_5

fun main() {

    val userName1: String = "Zaphoid"
    val userPassword1: String = "PanGalactic"

    println("Добро пожаловать на борт судна \"Heart of Gold\"!\nЯ бортовой робот - андроид Марвин, вы уже прошли авторизацию? (YES/NO):")
    val userAnswer = readln()

    if (userAnswer == "YES") {
        println("В таком случае введите пожалуйста свое имя пользователя и пароль:")
    }else {
        println("Бортовой робот-андроид Марвин печально запрашивает имя пользователя для регистрации")
    }

    val userName = readln()
    val userPassword = readln()

    if (userName == userName1 && userPassword == userPassword1) {
        println("Ваши данные проверены, и о, чудо, они верны... Пользователь $userName1, вам разрешено входить на борт корабля \"Heart of Gold\"")
    } else {
        println("Завершить программу...")
    }
}