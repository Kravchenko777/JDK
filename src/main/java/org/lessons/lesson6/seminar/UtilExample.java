package org.lessons.lesson6.seminar;

import org.apache.commons.math3.util.CombinatoricsUtils;
import org.apache.commons.math3.util.ArithmeticUtils;
public class UtilExample {

    public static void main(String[] args) {
        //Факториал
        System.out.println(CombinatoricsUtils.factorial(10));
        //Сумма
        System.out.println(ArithmeticUtils.addAndCheck(10,200));
        //Наибольший общий делитель
        System.out.println(ArithmeticUtils.gcd(10,15));
        //Наименьшее общее частное
        System.out.println(ArithmeticUtils.lcm(10,15));
        //Проверить что число степень двойки
        System.out.println(ArithmeticUtils.isPowerOfTwo(20));
    }
}
