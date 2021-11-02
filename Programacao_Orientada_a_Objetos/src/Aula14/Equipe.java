package Aula14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> listaJogadores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);
    }

    public void mostrarTitulares(){
        Collections.sort(listaJogadores);
        for (Jogador jogador: listaJogadores){
            if (jogador.isTitular())
                System.out.println("Nome: "+jogador.getNome()+", Camisa: "+jogador.getNumCamisa());
        }
    }

    public int mostrarLesionados(){
        int numLesionado = 0;
        for (Jogador jogador: listaJogadores){
            if(jogador.isLesionado() && jogador.isTitular())
                numLesionado++;
        }
        return numLesionado;
    }
}
