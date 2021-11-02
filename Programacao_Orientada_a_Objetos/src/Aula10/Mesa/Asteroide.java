package Aula10.Mesa;

public class Asteroide extends Objeto{
    private int danos;

    Asteroide(int posx, int posy, char direcao, int danos){
        super(posx, posy, direcao);
        this.danos = danos;
        //bloco cod
    }

    //irA será herdado de Obj

    //Asteroide não gira. Pode dar guinadas de 180º

    //nave tem que dar get em danos para restaVida()
    public int getDanos() {
        return danos;
    }
}
