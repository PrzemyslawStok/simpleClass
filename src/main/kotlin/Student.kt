import kotlin.random.Random

class Student(val imie:String, val nazwisko: String){

    var id = 23322
    var adres = ""

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
        println("Adress: ${this.adres}")
    }

    fun wygenerujId(){
        this.id = Random.nextInt(1000,1100)
    }

    fun wygenerujAdres(){
        val a = 0
        val b = 0

        if(this.adres.isEmpty()){
            this.adres = "Bielsko-Biała ${a}/${b}"
        }
    }

    init{
        wygenerujAdres()
    }

}
