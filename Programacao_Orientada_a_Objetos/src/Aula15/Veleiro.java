package Aula15;

public class Veleiro extends Embarcacao{
    private int numMastros;
    //private boolean veleiroGrande;

    public Veleiro(double precoBase, double valorAdicional, int anoFab, double comprimento, int numMastros) {
        super(precoBase, valorAdicional, anoFab, comprimento);
        this.numMastros = numMastros;
    }

    public boolean veleiroGrande(){
        if (numMastros > 4)
            return true;
        else
            return false;
    }

    @Override
    public double calcAluguel() {  //anoFab > 2020 && veleiroGrande == true
        double valorAdicionalGrande = 500.00;
        if (getAnoFab() > 2020 && veleiroGrande())
            return getPrecoBase() + getValorAdicional() + valorAdicionalGrande;
        else if (getAnoFab() > 2020)
            return getPrecoBase() + getValorAdicional();
        else if (veleiroGrande())
            return getPrecoBase() + valorAdicionalGrande;
        else
            return getPrecoBase();
    }
}
