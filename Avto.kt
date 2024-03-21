abstract class Avto(override var brand: String,
                    override var power: Double,
                    override var price: Double,
                    override var country: String,
                    var M: Double
):IAvto {

    override fun Input() {
        try {
            println("Введите марку автомобиля: ")
            brand = readln()
            println("Введите мощность автомобиля(в л. с.): ")
            power = readln()!!.toDouble()
            println("Введите стоимость автомобиля(т. рублей): ")
            price = readln()!!.toDouble()
        }catch (e:Exception)
        {
            println("Неверный ввод. Заполнилось как '0.0'")
        }
    }

    override fun Output() {
        try {
        println(
            "Марка автомобиля: $brand,\nМощность: $power л.с.," +
                    "\nСтоимость: $price т.рублей, \nСтрана производства: $country"
        )
    }catch (e:Exception)
        {
            println("Проблемы?")
        }
    }
    abstract fun Watt()
}