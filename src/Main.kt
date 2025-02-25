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

    //removeitems
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

}

