fun main(args: Array<String>) {

    fun puzzle1(){
        val reader = FileReader();
        val puzzle = reader.getPuzzle1()

        var previous = puzzle[0]
        var increases = 0

        puzzle.forEach{
            if (it > previous){
                increases++
            }
            previous = it
        }
        println(increases)
    }

    puzzle1()
    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
}


//vorig getal bijhouden
//volgend ophalen
//bijde vergelijken
//if cuurent is klijner dan next increase++