class Student(val name: String, val surname: String) {
    var oszczednosci: Double = 0.0

    fun printStudent(){
        println("Imię: ${name} Nazwisko: ${surname}")
        println("Oszczednosci: ${oszczednosci} zł")
    }

    fun wplacKwote(kwota: Double){
        oszczednosci+=kwota
    }
}
