package com.company;

public class NOD_NOK {
    // рекурсивный метод вычисления НОД с помощью
    // алгоритма Евклида
    static int nod(int a, int b){
        if (b == 0){
            return a;
        }
        return nod(b, a % b);
    }

    //метод вычисления НОК
    static int nok(int a, int b){
        return a * b / nod(a,b);
    }
}
