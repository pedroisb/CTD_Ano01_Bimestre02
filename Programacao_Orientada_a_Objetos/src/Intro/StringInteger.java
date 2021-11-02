//Defina duas sequências de texto. Verifique se são iguais ou diferentes e indique por meio de mensagem.

//Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais. Mostre o resultado obtido.

package Intro;

public class StringInteger {

    public static void main(String[] args) {
        String texto1 = "Java é osso";
        String texto2 = "Mas estou aprendendo";
        if (texto1.equals(texto2)) {
            System.out.println("Os textos são iguais");
        } else {
            System.out.println("Os textos são diferentes");
        };

        Integer valor1 = 65;
        Integer valor2 = 37;
        if (valor1.equals(valor2)) {
            System.out.println("Os valores são iguais");
        } else if (valor1.compareTo(valor2) > 0) {
            System.out.println("O primeiro valor é maior que o segundo");
        } else {
            System.out.println("O segundo valor é maior que o primeiro");
        };
    };
};
