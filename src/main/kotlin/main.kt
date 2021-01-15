import kotlin.random.Random

fun main() {
    val przemyslaw = Student("Przemysław","Stokłosa")
    val piotr = Student("Piotr","Stokłosa")

    val listaStudentow = mutableListOf(Student("Przemysław","Stokłosa"))

    for(i in 1..100) {
        listaStudentow.add(Student("Piotr", "Stokłosa", -1))
    }

    for(student in listaStudentow){
        student.info()
    }

}
