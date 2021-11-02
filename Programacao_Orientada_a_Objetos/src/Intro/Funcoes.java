//Faça uma função que receba dois valores como parâmetro e que no retorno sejam do tipo booleano. A função deve verificar se o primeiro número é divisível pelo segundo.

package Intro;

import java.util.Scanner;

public class Funcoes {

    private static boolean podeDividir (int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    };

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = entrada.nextInt();
        podeDividir(num1, num2);
        if (podeDividir(num1, num2) == true) {
            System.out.println(num1 +" é divisível por "+ num2);
        } else {
            System.out.println(num1 + " não é divisível por " + num2);
        }
    }
};
