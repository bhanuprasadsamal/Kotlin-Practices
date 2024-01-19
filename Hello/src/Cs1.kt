import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter 1st number: ")
    var m = sc.nextInt()
    print("Enter 2nd number: ")
    var n= sc.nextInt()
    var result=if (m>n)
        "$m is largest"

    else
        "$n is largest"

    print(result)
}