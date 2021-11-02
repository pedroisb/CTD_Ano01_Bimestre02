package Aula10;

public class Associado {
    private String numAssociado;
    private String nome;
    protected double valorMensal;
    private String atividade;

    Associado(String numAssociado,
              String nome,
              double valorMensal,
              String atividade){
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public double custo(){
        return this.valorMensal;
    }
}
