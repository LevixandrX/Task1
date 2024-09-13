fun main() {
    while (true) {
        println("Введите строку, в которой нужно подсчитать подряд идущие одинаковые символы (без цифр):")

        val input = readLine()

        if (input.isNullOrBlank() || !input.matches(Regex("[A-Za-zА-Яа-яЁё]+"))) {
            println("Ошибка: Введите непустую строку, состоящую только из букв.")
            continue
        }

        val result = StringBuilder()
        var count = 1

        for (i in 1 until input.length) {
            if (input[i] == input[i - 1]) {
                count++
            } else {
                result.append(input[i - 1])
                if (count > 1) result.append(count)
                count = 1
            }
        }

        result.append(input.last())
        if (count > 1) result.append(count)

        println("Результат: $result")
        break
    }
}