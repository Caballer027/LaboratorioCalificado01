package com.caballero.leo.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {

    @Test

    // Creamos la función principal para ejecutar el código
    fun main() {
        // Se definen dos palabras de entrada
        val palabra1 = "listen"
        val palabra2 = "silent"

        // Llamamos a la función esAnagrama con las dos palabras y mostramos el resultado
        println(esAnagrama(palabra1, palabra2)) // Esto imprimirá true

        // Probamos con otro ejemplo
        val palabra3 = "hello"
        val palabra4 = "world"

        // Llamamos a la función esAnagrama con otro par de palabras
        println(esAnagrama(palabra3, palabra4)) // Esto imprimirá false
    }

    // Ahora creamos la función para verificar si dos palabras son anagramas
    fun esAnagrama(palabra1: String, palabra2: String): Boolean {

        // Primero verificamos si las longitudes de las dos palabras son diferentes
        if (palabra1.length != palabra2.length) {

            // Y si las longitudes son diferentes, no pueden ser anagramas
            return false
        }

        // Ahora convertimos las palabras a listas de caracteres y ordenamos los caracteres de ambas palabras alfabéticamente
        val lista1 = palabra1.toCharArray().sorted()
        val lista2 = palabra2.toCharArray().sorted()

        // Por ultimo comparamos las listas de caracteres ordenadas, si son iguales, significa que las palabras tienen las mismas letras en la misma frecuencia
        return lista1 == lista2
    }
}
