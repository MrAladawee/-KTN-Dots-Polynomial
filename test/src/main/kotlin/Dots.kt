//package ency.dots

/*
Класс Точек хранит:
1. Координаты по OX, OY (сделано)

Методы:
1. Перемещение по OX (сделано)
2. Перемещение по OY (сделано)
3. Перемещение по OX + OY (сделано)
4. Расстояние от нач.координат до точки (сделано)
5. Сравнение на совпадение (сделано)
6. Оператор сложения двух точек (сделано)
7. Оператор умножения двух точек (сделано)
7. Умножение точки на константу (сделано)

*/

class Dots(var x : Double = 0.0, var y : Double = 0.0) {

    fun view() {
        println("OX: ${this.x}, OY: ${this.y}")
    }

    fun editX(pluserX : Double) {
        this.x += pluserX
    }
    fun editY(pluserY : Double) {
        this.y += pluserY
    }
    fun editXY(pluserX : Double, pluserY : Double) {
        this.x += pluserX
        this.y += pluserY
    }

    fun distance() : Double {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0))
    }

    fun isEqual(dot2: Dots) : Boolean {
        if ((this.x == dot2.x) && (this.y == dot2.y)) return true
        else return false
    }

    operator fun plus(other: Dots) = Dots(x + other.x, y + other.y)
    operator fun times(other: Dots) = Dots(x * other.x, y * other.y)
    operator fun times(multiply: Double) = Dots(x * multiply, y * multiply)

}