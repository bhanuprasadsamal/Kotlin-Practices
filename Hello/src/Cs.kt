import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter 1st number: ")
    var m = sc.nextInt()
    print("Enter 2nd number: ")
    var n= sc.nextInt()
    if (m>n){
        print("$m is largest")
    }
    else{
        print("$n is largest")
    }

}