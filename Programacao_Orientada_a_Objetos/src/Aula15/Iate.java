package Aula15;

public class Iate extends Embarcacao implements Comparable<Iate>{
    private int numCabines;

    public Iate(double precoBase, double valorAdicional, int anoFab, double comprimento, int numCabines) {
        super(precoBase, valorAdicional, anoFab, comprimento);
        this.numCabines = numCabines;
    }

    public boolean iateDelux(){
        if (numCabines > 6)
            return true;
        else
            return false;
    }

    @Override
    public double calcAluguel() {
        double valorAdicionalDelux = 1500.00;
        if (getAnoFab() > 2020 && iateDelux())
            return getPrecoBase() + getValorAdicional() + valorAdicionalDelux;
        else if (getAnoFab() > 2020)
            return getPrecoBase() + getValorAdicional();
        else if (iateDelux())
            return getPrecoBase() + valorAdicionalDelux;
        else
            return getPrecoBase();
    }

    @Override
    public int compareTo(Iate iate) {
        if (this.numCabines == iate.numCabines){
            System.out.println("Esse iate é tão luxuoso quanto aquele");
            return 0;
        } else if (this.numCabines > iate.numCabines){
            System.out.println("Esse iate é mais luxuoso do que aquele");
            return 1;
        } else {
            System.out.println("Aquele iate é mais luxuoso do que este");
            return -1;
        }
    }
}
