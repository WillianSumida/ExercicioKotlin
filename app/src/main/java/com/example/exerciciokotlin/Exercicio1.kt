package com.example.exerciciokotlin

fun main() {
    val listaCursos: MutableList<String> = mutableListOf(
            "Sistemas para Dispositivos Móveis",
            "Análise e Desevolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    var quantidade: Int = 0;

    listaCursos.forEach { if(it.contains("Sistemas")) {
        println("$quantidade - $it")
        quantidade+=1
        }
    }


}