import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    print("Enter the 1st : ")
    var m = sc.nextInt()

    print("Enter the 2nd : ")
    var n = sc.nextInt()

    print("Enter the 3rd : ")
    var p = sc.nextInt()

    var largest: Int

    if (m >= n) {
        if (m >= p) {
            largest = m
        } else {
            largest = p
        }
    } else {
        if (n >= p) {
            largest = n
        } else {
            largest = p
        }
    }

    println("The largest number is: $largest")
}
