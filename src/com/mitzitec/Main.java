package com.mitzitec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2;
        float suma;
        float resta;
        float mult;
        float divi;
        float modul;

        System.out.println("Digite 2 numeros");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1+numero2;
        resta = numero1-numero2;
        mult = numero1 * numero2;
        divi = numero1/numero2;
        modul = numero1%numero2;


        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("EL resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+mult);
        System.out.println("El resultado de la división es: "+divi);
        System.out.println("El resultado del módulo es: "+modul);

    }
}
