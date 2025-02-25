/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("kotiln mutableList")
    //create our list
    val snacks = mutableListOf<String>()

    //show it
    println(snacks)



    //add in some things
    snacks.add("cheetos")
    snacks.add("carrot")
    snacks.add("pizza")
    snacks.add("pineapple")
    snacks.add("cheese")
    snacks.add("cookey dough ")
    println(snacks)

    //show specifices snacke

    println(snacks[0])
   // println(snacks[6])
    //this would be out of bounds

    //change a value
    snacks[1] = "dog food"
    println(snacks)

    //remove items from list
    snacks.removeAt(0)

    println(snacks)

    snacks.add(1,"Baconstrings")
    println(snacks)

    //short the list
    snacks.sort()
    println(snacks)

    //shuffle the list (random)
    snacks.shuffle()
    println(snacks)


    //get a random item

    val item = snacks.random()
    println(item)

    //loop though the list
    for (snack in snacks) {
        println(snack)
    }

    //searching for an item
    println("pizza is in this list ${snacks.contains("pizza")}")
    println("hours in not in the list: ${snacks.contains("hours")}")

    //getting index of an item
    println("pizza index:${(snacks.indexOf("pizza"))}")


    //loop useing a list
    for (i in 0 ..<snacks.size) {
        println("$i:${snacks[i]}")
    }

    //loop getting index and values
    for((i, snack) in snacks.withIndex()) {
        println("$i:${snack}")
    }


}

