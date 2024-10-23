package com.david.kotlinintermedio

fun main(){
    var ejercicio=-1
    println("Elije un ejercicio: ")
    ejercicio= readln()!!.toInt()

    when(ejercicio){
        1->{
            var n=0
            /*1. Escribe una función llamada esPar que tome un número como argumento y devuelva true si es par y false si es impar.*/
            println("Num a comprobar:")
            n= readln()!!.toInt()
            if(esPar(n)) println("El número ${n} es par")
            else println("El número ${n} no es par")
        }
        2->{
            /*2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos y
            determine si son iguales utilizando tanto equals() como el operador ==*/
            var str1=""
            var str2=""
            var param=0
            println("Cadena 1:")
            str1=readln()!!.toString()
            println("Cadena 2:")
            str2=readln()!!.toString()
            println("¿Cómo las vas a comparar? (1-equals()/2-==)")
            param=readln()!!.toInt()
            if(compararTexto(str1, str2, param)) println("Las cadenas son iguales")
            else println("Las cadenas son diferentes")
        }
        3->{
            /*3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como argumentos
            y devuelva true si ambos números son mayores que 10 y menores que 20, y false en caso contrario.*/
            println("Num 1:")
            var num1=readln()!!.toInt()
            println("Num 2:")
            var num2=readln()!!.toInt()
            if(esMayorQue10YMenorQue20(num1,num2)) println("Los números son mayores que 10 y menores que 20")
            else println("Los números no son mayores que 10 y menores que 20")
        }
        4->{
            /*4. Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un
            número entre 0 y 100) como argumento y devuelva una letra de calificación (A, B, C, D, F) utilizando
            una estructura when.*/
            println("Escribe tu nota:")
            var nota=readln()!!.toFloat()
            println("Tu nota es: ${evaluarCalificacion(nota)}")

        }
        5->{
            /*5. Define una función llamada sumarNumeros que tome un número variable de argumentos utilizando
            la sintaxis vararg y devuelva la suma de todos los números.*/
            var suma=0
            suma=sumarNumeros(1,2,3,4,5,6,7,8,9,10)
            println("La suma de los números es: $suma")
        }
        6->{
            /*6. Implementa una función llamada invertirArray que tome un array de números como argumento y
            devuelva un nuevo array con los elementos en orden inverso.*/
            var nums=arrayOf(1,2,3,4,5,6,7,8,9,10)
            println("El array original es: ${nums.contentToString()}")
            println("El array invertido es: ${invertirArray(nums).contentToString()}")
        }
        7->{
            /*7. Crea una lista inmutable de nombres de frutas y agrega una fruta adicional a la lista.*/
            var frutas =mutableListOf("pera", "platano", "granada", "manzana")
            println("Añade una fruta:")
            frutas.add(readln()!!.toString())
            println("Las frutas son: ${frutas}")
        }
        8->{
            /*8. Utiliza una lista mutable para almacenar nombres de colores y elimina un color de la lista.*/
            var colores =mutableListOf("rojo", "azul", "verde", "amarillo")
            println("Los colores son: ${colores}")
            println("Elimina un color:")
            colores.remove(readln()!!.toString())
            println("Los colores son: ${colores}")
        }
        9->{
            /*9. Escribe una función llamada imprimirNumeros que utilice un bucle for para imprimir los números del 1 al 10.*/
            println(imprimirNumeros(1,10))
        }
        10->{
            /*10. Define una función llamada imprimirLista que tome una lista de números como argumento y utilice un bucle
            forEach para imprimir cada número en la lista.*/
            var nums=listOf(1,2,3,4,5,6,7,8,9,10)
            imprimirLista(nums)
        }
        11->{
            /*11. Implementa una función llamada imprimirNumerosHastaN que tome un número como argumento y utilice un bucle while 
            para imprimir los números del 1 al número dado.*/
            println("Escribe un número:")
            var num= readln().toInt()
            imprimirNumerosHastaN(num)
        }
        12-> {
            /*12. Crea una función llamada imprimirNumerosPositivos que utilice un bucle do-while para imprimir números
            positivos hasta que se alcance un número negativo.*/
            var nums=listOf(1,2,3,4,5,6,7,8,9,10,-1,-2,-3,-4,-5)
            imprimirNumerosPositivos(nums)
        }
        13->{
            /*13. Define una función llamada esPrimo que tome un número como argumento y devuelva true si es primo y false si no lo
            es. Utiliza una declaración return para salir de la función una vez que se determine si el número es primo.*/
            println("Escribe un número:")
            var num= readln().toInt()
            if(esPrimo(num)) println("El número ${num} es primo")
            else println("El número ${num} no es primo")
        }
        14->{
            /*14. Implementa una función llamada encontrarPrimoMayorQue100 que utilice un bucle for para encontrar el primer número primo
            mayor que 100. Utiliza una declaración break para salir del bucle una vez que se encuentre el número primo.*/
            println(encontrarPrimoMayorQue100())
        }


        else->{
            println("Ejercicio no encontrado")
        }

    }
}
//funciones
//ej01
fun esPar(num:Int):Boolean{
    return num%2==0
}
//ej02
fun compararTexto(a:String, b:String, param:Int):Boolean{
    if(param==1) return a.equals(b)
    else if(param==2)
        return a==b
    else throw Exception("Error")
}
//ej03
fun esMayorQue10YMenorQue20(a:Int, b:Int):Boolean{
    var res=false
    if(a>10 && a<20 && b>10 && b<20)res=true
    return res
}
//ej04
fun evaluarCalificacion(nota:Float):Char{
    when(nota){
        in 90f..100f->return 'A'
        in 80f..89f->return 'B'
        in 70f..79f->return 'C'
        in 60f..69f->return 'D'
        in 0f..59f->return 'F'
        else->throw Exception("Error")
    }
}
//ej05
fun sumarNumeros(vararg nums:Int):Int{
    var suma:Int
    suma=0
    nums.forEach {
        suma+=it
    }
    return suma
}
//ej06
fun invertirArray(arr:Array<Int>):Array<Int>{
    var newArr=arrayOf<Int>()
    for(i in arr.size-1 downTo 0){
        newArr+=arr[i]
    }
    return newArr
}
//ej09
fun imprimirNumeros(primero:Int, final:Int):List<Int>{
    var nums=mutableListOf<Int>()
    for(i in primero..final){
        nums.add(i)
    }
    return nums
}
//ej10
fun imprimirLista(nums:List<Int>){
    nums.forEach {
        println(it)
    }
}
//ej11
fun imprimirNumerosHastaN(num:Int) {
    var i = 1
    while (i <= num) {
        println(i)
        i++
    }
}
//ej12
fun imprimirNumerosPositivos(nums:List<Int>){
    var i=0
    do {
        println(nums[i])
        i++
    }while (nums[i]>0)
}
//ej13
fun esPrimo(num:Int):Boolean {
    var i = 2
    while (i < num) {
        if (num % i == 0) return false
        i++
    };return true
}
//ej14
fun encontrarPrimoMayorQue100():Int{
    var encontrado=0
    for (i in 101..Int.MAX_VALUE) {
        if (esPrimo(i)) {
            encontrado = i
            break
        }
    }
    return encontrado
}