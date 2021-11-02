package Aula15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Embarcacao implements Locacao {
    private double precoBase;
    private double valorAdicional;
    private int anoFab; //LocalDate (yyyy)
    private double comprimento;
    private Capitao capitao;

    public Embarcacao(double precoBase, double valorAdicional, int anoFab, double comprimento) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFab = anoFab;
        this.comprimento = comprimento;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public void setCapitao(Capitao capitao) {
        this.capitao = capitao;
    }
}
