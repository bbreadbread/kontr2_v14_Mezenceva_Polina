import SportCar.*

import kotlinx.coroutines.*

suspend fun main()= runBlocking{
    try
    {
    print("Количество повторов: ")
    var n = readLine()!!.toInt()
    if (n>0){
        while (n>0)
        {
            println("\nПовторов осталось: ${n}")
           var sc = SportCar("", 0.0,0.0,0.0,"")
            try
            {
                launch {
                    sc.Input()
                    sc.Country()

                    sc.Output()
                    sc.Watt()

                }
            }
        catch (e:Exception)
            {
                println("Проблемы?")
            }

            delay(10000)
            println("\nИ тут внезапно....\n")
            println("Бонус!!! ")
            sc.FunFact()
            n--
        }
    }
    else println("Нужен хотя бы один повтор\n")
}
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}
