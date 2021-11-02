//Defina dois números inteiros. Atribua um valor a cada um. Verifique se um número é divisível pelo segundo e indique o resultado obtido por meio de uma mensagem.

package Intro;

public class Estruturas {

    public static void main(String[] args) {
	float num1 = 8;
	float num2 = 4;
	if (num1%num2 == 0) {
        System.out.println("O resultado da divisao foi de: "+num1/num2+". "+num1+" é divisível por "+num2+"!");
        } else {
        System.out.println("O resultado da divisao foi de: "+num1/num2+". "+num1+" não é divisível por "+num2+"!");
    };
    }
};
