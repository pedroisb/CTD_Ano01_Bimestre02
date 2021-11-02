//Digite seu nome e sobrenome separadamente, a partir dessas variáveis, você deve obter uma terceira com as suas iniciais

package Intro;

import java.util.Scanner;

public class NomeSobrenome {

    public static void main(String[] args) {
        String nome;
        String sobrenome;
        char inicialNome;
        char inicialSobrenome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite o seu sobrenome");
        sobrenome = scanner.nextLine();

        inicialNome = nome.charAt(0);
        inicialSobrenome = sobrenome.charAt(0);
        System.out.println("Suas iniciais são: "+inicialNome+inicialSobrenome);
    };
};
