package Aula10.Mesa;

public class Objeto {
    private int posx;
    private int posy;
    private char direcao;

    Objeto(int posx, int posy, char direcao){
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

    public void irA(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }
}
