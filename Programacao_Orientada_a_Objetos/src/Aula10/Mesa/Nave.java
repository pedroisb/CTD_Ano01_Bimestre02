package Aula10.Mesa;

public class Nave extends Objeto {
    private double velocidade;
    private int vida;

    //sobrecarga da construtora obj
    Nave(int posx, int posy, char direcao, double velocidade){
        super(posx, posy, direcao);
        this.velocidade = velocidade;
        this.vida = 100;
    }

    //irA vai ser herdado, mas deverá ser sobreescrito para atender a especificações do comportamento da nave


    public void girar(char direcao){
        switch (direcao){
            case 'N':
                System.out.println("A nave girou para o Norte");
            case 'S':
                System.out.println("A nave girou para o Sul");
            case 'L':
                System.out.println("A nave girou para o Leste");
            case 'O':
                System.out.println("A nave girou para o Oeste");
                break;
        }
    }

    public void restaVida(int valor){


    }
}
