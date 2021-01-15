class Student(var imie:String, var nazwisko: String){

    var id = 23322

    constructor(imie: String, nazwisko: String, id: Int) : this(imie,nazwisko) {
        //this.imie = imie
        //this.nazwisko = nazwisko
        this.id = id
    }

    fun info(){
        println("Imię: ${this.imie}")
        println("Nazwisko: ${this.nazwisko}")
        println("Id: ${this.id}")
    }

}
