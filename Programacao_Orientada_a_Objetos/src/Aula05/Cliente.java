package Aula05;

public class Cliente {

    private int numeroCliente;
    private String nome;
    private double divida;

    Cliente(){}

    Cliente(int numeroCliente, String nome){
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }

    public double aumentarDivida(double valor){
        return this.divida += valor;
    }
    public void pagarDivida(){
        this.divida = 0;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
