import java.util.*

fun main(){
    stringToArray("hello", "world","How're","Things")    //question 1

    capitalize()                                                                //question2

    stringFunctions()                                                         //question3

    println(Arrays.toString(arrayName("Shadya","Obuya","Gard"))) //question4

}

//question1
fun stringToArray(word:String,word1:String,word2:String,word3:String) {
    var wordStrings = arrayOf(word, word1, word2, word3)
    println(Arrays.toString(wordStrings))
}


//question2
fun capitalize() {

    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (city in cities) {                            //capitalize each word/element in cities array
        println(city.capitalize())
    }
}


//question 3
fun stringFunctions(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)

        var sum=numbers.get(1) + numbers.get(4)  //get the second and fifth element then add
        println(sum)

    var index=numbers.indexOf(158)              //print out index of 158
        println(index)

    var sortedArray=numbers.sortedArray()       // print out elements in ascending order
    println(Arrays.toString(sortedArray))
}

//question 4
fun arrayName(name1:String, name2:String,name3:String):Array<String>{
    var names=arrayOf(name1,name2,name3)
    return names
}
