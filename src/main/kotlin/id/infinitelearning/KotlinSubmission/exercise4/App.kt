package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        val result = 9 / 0
        println("The result: $result")
    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
    }
}