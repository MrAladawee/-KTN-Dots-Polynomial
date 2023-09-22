//package ency.polynomial

/*
Класс Полинома хранит:
1. Степень полинома
2. Массив (vararg / array) коэф.

Методы:
1. Получение степени полинома (get запрос)
2. Получение коэф. при i'й  степени (сделано)
3. Задание коэф при i'й степени (сделано)
4. Оператор сложения двух полиномов
5. Умножение полинома на константу
6. Корректировка полинома - переопределение степени полинома (проверка на нулевой коэф.при старшой степени) (сделано)

Конструкторы:
1. Создаем полином нулевой степени с коэф.при нулевой степени равным нулю
2. Полноценный полином: задается степень, коэффициенты -> степенью полинома является номер ненулевого коэф-а (n-1)
(наверное можно объединить конструктор в один с дефолтными параметрами)
 */

class Polynomial(var deg: Int = 0, var arrayCoef : Array<Double> = arrayOf(0.0)) {

    fun view() {

        if (deg == 0) println(arrayCoef[0])
        else {

            var viewString = "" // результирующая строка
            var degTemp = deg
            var viewTemp : String

            for (i in arrayCoef.size downTo 1 ) {

                viewTemp = "${arrayCoef[i-1]}*x^${degTemp} + "

                /* иной вариант:
                viewTemp = "${arrayCoef[i-1]}*x^${degTemp} + }"
                viewTemp = (StringBuilder().append("${arrayCoef[i-1]}*").append("x^${degTemp} + ")).toString() // Вид: "4*x^2 + "
                 */
                //viewString  = (StringBuilder().append(viewTemp)).toString() // Вид: "4*x^2 + 3*x^1 + 3 + "

                viewString += viewTemp

                degTemp--
            }

            viewString = viewString.substring(0, viewString.length - 7) // 7 символов это "*x^0 + "

            println(viewString)

        }

        // Пусть Полином не имеет "огрехов" в степени.

    }

    fun getCoef(deg_i: Int) : Double {
        return arrayCoef[deg_i]
    }

    fun editCoef(deg_i : Int, newCoef: Double) {
        arrayCoef[deg_i] = newCoef
    }

    fun reconstructer() : Boolean {
        var _deg = this.deg
        var _arrayCoef = this.arrayCoef

        // Степень равна размеру и последний элемент не нуль
        if ((_deg + 1 == _arrayCoef.size)
            && (_arrayCoef.last() != 0.0)) {

            // Делать ничего не нужно
            return true

        }

        // Степень равна размеру и последний элемент нуль
        else if ((_deg + 1 == _arrayCoef.size)
            && (_arrayCoef.last() == 0.0)){

            this.deg -= 1
            this.arrayCoef = arrayCoef.copyOfRange(0, arrayCoef.lastIndex)
            return true

        }

        // Степень меньше размера и последний элемент не нуль
        else if ((_deg + 1 < _arrayCoef.size)
            && (_arrayCoef.last() == 0.0)) {

            this.deg = _arrayCoef.size
            return true

        }

        // Степень меньше размера и последний элемент нуль
        else if ((_deg + 1 < _arrayCoef.size)
            && (_arrayCoef.last() == 0.0)) {

            var indexNotZero : Int = 0
            for (i in 0.._arrayCoef.size-1) {
                if (_arrayCoef[i] != 0.0) indexNotZero = i
            }

            this.deg = indexNotZero
            this.arrayCoef = _arrayCoef.copyOfRange(0,indexNotZero+1)
            return true
        }

        // Степень больше размера и последний элемент не нуль
        else if ((_deg + 1 > _arrayCoef.size)
            && (_arrayCoef.last() != 0.0)) {
            this.deg = _arrayCoef.size-1
        }

        // Степень больше размера и последний элемент нуль
        else if ((_deg + 1 > _arrayCoef.size)
            && (_arrayCoef.last() == 0.0)) {

            var indexNotZero : Int = 0
            for (i in 0.._arrayCoef.size-1) {
                if (_arrayCoef[i] != 0.0) indexNotZero = i
            }
            this.deg = indexNotZero
            this.arrayCoef = _arrayCoef.copyOfRange(0,indexNotZero+1)
            return true
        }

        // Есть какая-то ошибка
        return false

    }

    operator fun plus (other: Polynomial) {



    }

}