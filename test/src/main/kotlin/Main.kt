fun main() {

    /*
    СКРЫВАЕТСЯ ТЕСТОВАЯ ЧАСТЬ КЛАССОВ

    /* проверка класса точек */

    println("\nПРОВЕРКА ТОЧЕК:\n")

    var dot1 = Dots(5.0,5.0)
    print("Dot1: ") ; dot1.view()

    println()

    var dot2 = Dots(1.0, 1.0)
    print("Dot2: ") ; dot2.view()
    println("Расстояние  от нач.координат: ${dot2.distance()}")
    dot2.editX(1.0) ; dot2.view()
    dot2.editY(1.0) ; dot2.view()
    dot2.editXY(1.0,1.0) ; dot2.view()

    println("\ndot1 = dot2? : ${dot1.isEqual(dot2)}\n")

    println("Прибавим к dot2 x,y : 2 и проверим сравнение")
    dot2.editXY(2.0,2.0)
    print("Dot1: ") ; dot1.view()
    print("Dot2: ") ; dot2.view()
    println("dot1 = dot2? : ${dot1.isEqual(dot2)}")

    print("\nСложение двух точек:\nDot3: ") ; var dot3 = Dots(3.2, 1.4) ; dot3.view()
    print("Dot4: "); var dot4 = Dots(4.8, 1.6) ; dot4.view()
    (dot3 + dot4).view()

    print("\nУмножение двух точек:\nDot5: ") ; var dot5 = Dots(3.0, -1.0) ; dot5.view()
    print("Dot6: "); var dot6 = Dots(2.0, 5.0) ; dot6.view()
    (dot5 * dot6).view()

    print("\nУмножение точки на скаляр 4.0:\nDot7: ") ; var dot7 = Dots(2.0, -2.0) ; dot7.view()
    (dot7 * 4.0).view()


    println("\nПРОВЕРКА ПОЛИНОМОВ:\n")

    /* проверка класса полиномов */

    var arrayCoefForPoly1 = arrayOf(1.0)
    var arrayCoefForPoly2 = arrayOf(1.0, 4.2)
    var arrayCoefForPoly3 = arrayOf(1.0, 4.2, 3.23, 9.213, 345.123)
    var arrayCoefForPoly4 = arrayOf(22.0, 0.0, 33.0, 0.0, 4.0)
    var arrayCoefForPoly5 = arrayOf(0.0, 0.0, 3.23, 0.0, 2.0)

    var poly1 = Polynomial(0, arrayCoefForPoly1)
    var poly2 = Polynomial(1, arrayCoefForPoly2)
    var poly3 = Polynomial(4, arrayCoefForPoly3)
    var poly4_ = Polynomial(4, arrayCoefForPoly4)
    var poly5_ = Polynomial(4, arrayCoefForPoly5)

    poly1.view() ; poly2.view() ; poly3.view() ; poly4_.view() ; poly5_.view()  // вывод пяти полиномов

    println()

    println("Коэф при 3 степени: ${poly3.getCoef(3)} для третьего полинома.")
    println("Изменим коэф. при 3 степени на 4.0:")
    poly3.editCoef(3, 4.0) ; poly3.view()
    println("Коэф при 3 степени: ${poly3.getCoef(3)} для третьего полинома.")

    println("\nСоздание пустого полинома с 0 степенью:")
    var poly4 = Polynomial()
    poly4.view()

    println("\nСоздание пустого полинома с 5 степенью и без коэф:")
    var poly5 = Polynomial(5)
    poly5.view()
    println("Poly5's deg: = ${poly5.deg}")

    println()
    println("````````")
    println("````````")


    var ArrayTest1 : Array<Double> = arrayOf(3.0,4.0,6.0)
    var ArrayTest2 : Array<Double> = arrayOf(3.0,4.0,0.0)


    // Степень равна размеру и последний элемент не нуль
    var poly7 = Polynomial(2, ArrayTest1)
    println("NOW Степень  poly7: ${poly7.deg}")
    poly7.view() ; poly7.reconstructer()
    println("AFT Степень  poly7: ${poly7.deg}")
    poly7.view()
    println()

    // Степень равна размеру и последний элемент нуль
    var poly8 = Polynomial(2, ArrayTest2)
    println("NOW Степень  poly8: ${poly8.deg}")
    poly8.view() ; poly8.reconstructer()
    println("AFT Степень  poly8: ${poly8.deg}")
    poly8.view()
    println()


    // ОШИБКА ТУТ
    // Степень меньше размера и последний элемент не нуль
    var poly9 = Polynomial(1, ArrayTest1)
    println("NOW Степень  poly9: ${poly9.deg}")
    poly9.view()
    poly9.reconstructer()
    println("AFT Степень  poly9: ${poly9.deg}")
    poly9.view()
    println()

    // ОШИБКА ТУТ
    // Степень меньше размера и последний элемент нуль
    var poly10 = Polynomial(1, ArrayTest2)
    println("NOW Степень  poly10: ${poly10.deg}")
    poly10.view()
    poly10.reconstructer()
    println("AFT Степень  poly10: ${poly10.deg}")
    poly10.view()
    println()


    // Степень больше размера и последний элемент не нуль
    var poly11 = Polynomial(4, ArrayTest1)
    println("NOW Степень  poly11: ${poly11.deg}")
    poly11.view() ; poly11.reconstructer()
    println("AFT Степень  poly11: ${poly11.deg}")
    poly11.view()
    println()

    // Степень больше размера и последний элемент нуль
    var poly12 = Polynomial(4, ArrayTest2)
    println("NOW Степень  poly12: ${poly12.deg}")
    poly12.view() ; poly12.reconstructer()
    println("AFT Степень  poly12: ${poly12.deg}")
    poly12.view()
    println()


    /*

    for (elem in ArrayTest1.copyOfRange(0, ArrayTest1.lastIndex)) {
        print("$elem ")
    }
    println()
    println(ArrayTest1.lastIndex)


    var ArrayTest3 = ArrayTest1 + ArrayTest2
    for (i in ArrayTest3) {
        print("${i} ")
    }
    */

    СКРЫВАЕТСЯ ТЕКСТОВАЯ ЧАСТЬ КЛАССОВ
    */

    /* СКРЫВАЕТСЯ ТЕСТОВАЯ ЧАСТЬ ДЕЙСТВИЙ НАД ПОЛИНОМАМИ (+, *)
    var ArrayCoefTest1 = arrayOf(1.0, 2.0, 3.0)
    var ArrayCoefTest2 = arrayOf(9.0, 8.0, 7.0, 6.0)

    var poly1 = Polynomial(2, ArrayCoefTest1)
    var poly2 = Polynomial(3, ArrayCoefTest2)

    (poly1 + poly2).view()
    println()
    poly1.view()
    (poly1 * 4.0).view()
    СКРЫВАЕТСЯ ТЕСТОВАЯ ЧАСТЬ ДЕЙСТВИЙ НАД ПОЛИНОМАМИ (+, *)
    */

}