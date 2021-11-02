package Aula16;

import Aula16.ClienteException;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= 0;
        this.divida =0;
        saldoEmConta=0;

    }

    // throws prepara o java para possivel exceção
    public void comprar(double valor) throws ClienteException{
        if (valor > (this.saldoEmConta + this.limite)){
            throw new ClienteException("Saldo Insuficiente!");
        }else{
            this.saldoEmConta -= valor;
        }
    }

    public void pagarDivida(double valor) throws ClienteException{
        if (this.divida <= 0){
            throw new ClienteException("Você não tem dívida!");
        }else{
            this.divida += 0;
        }
    }
}