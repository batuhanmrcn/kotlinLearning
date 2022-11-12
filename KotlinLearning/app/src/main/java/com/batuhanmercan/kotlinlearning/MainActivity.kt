package com.batuhanmercan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables && Constants
        var x = 4
        var y = 5

        println(x * y)

        var age = 35

        val result = age / 7 * 5

        println(result)

        var MyInteger : Int
        MyInteger = 10
        MyInteger = 20

        val a : Int = 23
        println(a/2)

        //Double & Float

        val pi = 3.14
        println(pi * 2.0)

        val myFloat = 3.14f
        println(myFloat * 2)

        var myAge : Double = 23.0
        println(myAge/2.0)

        val myString = "batuhan mercan"
        val name = "James"
        val surname = "Hetfield"

        val fullname = name + " " + surname
        println(fullname)

        val larsName : String = "Lars"
        println(myString.capitalize())
    //Boolean
        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // <
        // >
        //<=
        //>=
        //==
        // !=
        // &&  -> AND
        // ||  -> OR
        println(3 < 5)

        //Conversion
        var myNumber = 5
        var myLong = myNumber.toLong()
        println(myLong)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)

        //Collections : Veriyi ya da herhangi bir seyi toplamak,birden fazla veriyi tek bir değişken obje altında toplamamızı sağlıyor.
        //Arrays : dizi

        val myArray = arrayOf("james","Kirk","Rob","Lars")
            //index : 0 'dan baslar
       println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val newArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("batu",8)
        println(mixedArray[0])
        println(mixedArray[1])


        val myMusicians = arrayListOf<String>("batu","cago")
        myMusicians.add("tahir")
        println(myMusicians[2])
        myMusicians.add(0,"Merco")
        println(myMusicians[0])


        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(40)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Batu")
        myMixedArrayList.add(12.23)
        myMixedArrayList.add(true)
        println(myMixedArrayList[0])

        val mySet = setOf<Int>(1,1,2,3,)

        mySet.size
        //For-Each

        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Batu")
        myStringSet.add("Batu")
        println(myStringSet.size)

        //Map - HashMap
        // Key - Value

         val fruitArray = arrayOf("Apple","Banana")
         val caloriesArray = arrayOf(100,150)
        println("fruit: ${fruitArray[0]} : ${caloriesArray[0]}")


        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])


        val myHashMap = hashMapOf<String,String>()

        val myNewMap = hashMapOf<String,Int>("A" to 1 , "B" to 2)
        println(myNewMap["B"])

        //If control
        println("----IF CONTROL----")

        var myNumberAge = 52
        if (myNumberAge < 30){
            println("< 30")
        } else if (myNumberAge >= 30 && myNumberAge < 40) {
            println("30 - 40")
        } else if (myNumberAge <= 40 && myNumberAge < 50) {
                println("40 -  50")
        } else {          //else :  bu sagladıgım kosullardan hicbiri tutmazsa ne yapayım demek
            println(">= 50")
        }

              //  SWITCH - WHEN
           println("----SWITCH - WHEN CONTROL----")

        val day = 3
        var dayString = ""
        /*
        if (day==1 ){
            dayString = "Monday"
        } else if (day == 2 ){
            dayString = "Tuesday"
        } else if (day == 3 ){
            dayString = "Wednesday"
        }
            println(dayString)

         */

        when(day){

            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""

        }
        println(dayString)
        //Loops
        //For Loop

        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q  = myArrayOfNumbers[0] / 3 * 5
         println(q)

        for (number in myArrayOfNumbers){
            val z = number / 3 * 5
            println(z)
        }
            for (b in 0..9){
                println(b)
            }
        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Batu")
        myStringArrayList.add("Mercan")
        myStringArrayList.add("Mavi")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        //While Loop

        var j = 0
            while (j < 10 ){
                println(j)
            j = j + 1

            }

        }


    }

