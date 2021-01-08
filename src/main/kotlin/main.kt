fun main() {
    val przemyslaw = Student("Przemysław","Stokłosa")
    val piotr = Student("Piotr","Stokłosa")

    piotr.wplacKwote(100.0)

    przemyslaw.printStudent()
    piotr.printStudent()

    piotr.wplacKwote(1000.0)
    piotr.printStudent()
}
