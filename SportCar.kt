class SportCar(brand: String, power: Double, price: Double, M: Double,
               country: String): Avto(brand, power, price,country, M ) {

    fun FunFact(){
        try {
            println("Выберите модель спортивного автомобиля:\n 1. Porsche\n 2. Subaru\n 3. Lexus\n для фанфакта")
            var answer = readLine()
            if (answer == "1") println("Porsche пользуется заслуженным уважением среди любителей спорткаров)")
            else if (answer == "2") println("Этот автомобиль имеет специально созданное для него шосси, которого нет в других автомобилях!!!")
            else if (answer == "3") println("Выдает до 470 л.с.! Во даёт!!")
            else println("Неизвестное действие")
        }
        catch (e:Exception)
        {
            println("Проблемы?")
        }
    }
    fun Country(){
        try {
            println("Страна производства: ")
            country = readln()

        }catch(e:Exception)
        {
            println("Проблемы?")
        }
    }
    override fun Watt() {
        try {
            M = power * 735.49875
            println("В вашей марке машины $M Ватт мощности")
        }catch (e:Exception)
        {
            println("Проблемы?")
        }
    }
}