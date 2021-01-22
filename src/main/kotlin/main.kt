
fun main() {
    val przemyslaw = Student("Przemysław","Stokłosa")
    val piotr = Student("Piotr","Stokłosa")

    val listaStudentow = mutableListOf<Student>()

    for(i in 1..100) {
        listaStudentow.add(Student("Piotr", "Stokłosa", 5))
    }

    for(student in listaStudentow){
        student.info()
    }

}
