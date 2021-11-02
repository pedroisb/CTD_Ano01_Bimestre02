package Aula16.Mesa;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {

    //ATRIBUTOS
    private String nome;
    private String sobrenome;
    private String rg;
    private Date dataInternacao;
    private Date dataAlta;

    //MÉTODOS

    //CONSTRUTORA
    public Paciente(String nome, String sobrenome, String rg, Date dataInternacao) throws PacienteException{
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.rg = rg;

        Date hoje = new Date();
        if (dataInternacao.equals(hoje))
            this.dataInternacao=dataInternacao;
        else
            throw new PacienteException("Data incorreta!");

        this.dataAlta=null;

    }

    //MÉTODOS GETTERS
    public Date getDataInternacao() {
        return dataInternacao;
    }
    public Date getDataAlta() {
        return dataAlta;
    }

    //MÉTODOS IMPLEMENTADOS
    public void darAlta(Date dataAlta)
    {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok");
        else
            System.out.println("Não pode");
    }



}
