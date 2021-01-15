class Student{
    var imie = ""
    var nazwisko = ""
    var id = "23322"

    constructor(imie: String, nazwisko: String){
        this.imie = imie
        this.nazwisko = nazwisko
    }

    fun info(){
        println("Imię: ${this.imie}")
    }

}
