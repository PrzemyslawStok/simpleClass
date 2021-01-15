import kotlin.random.Random

class Student(val imie:String, val nazwisko: String){

    var id = 23322

    constructor(imie: String, nazwisko: String, id: Int) : this(imie,nazwisko) {
        //this.imie = imie
        //this.nazwisko = nazwisko
        this.id = id

        if(id==-1)
            wygenerujId()
    }

    fun info(){
        println("Imię: ${this.imie}")
        println("Nazwisko: ${this.nazwisko}")
        println("Id: ${this.id}")
    }

    fun wygenerujId(){
        this.id = Random.nextInt(1000,1100)
    }

}
