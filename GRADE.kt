fun main() {
    var skor = 90
    var grade =""

    println("skor=$skor")
    if (skor <= 100 && skor >= 81) {
        grade = "A"
    } else if (skor <= 80 && skor >= 71) {
        grade = "B"
    } else if (skor <= 70 && skor >= 61) {
        grade = "C"
    } else if (skor >= 0 && skor <= 60) {
        grade = "D"
    } else {
        print("Skor tidak diketahui")
    }
    println("Grade:$grade")

    when(grade){
        "A" , "B"-> print("lulus")

        "C" -> print("remedial")

        "D" -> print("tidak lulus")
    }
}
