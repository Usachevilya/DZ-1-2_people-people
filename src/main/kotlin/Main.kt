fun main() {
    val likes = 511
    if (likes % 100 == 11) {
        println("Нравится " + likes + " людям")
    } else if (likes % 10 == 1) {
        println("Нравится " + likes + " человеку")
    } else {
        println("Нравится " + likes + " людям")
    }
}


