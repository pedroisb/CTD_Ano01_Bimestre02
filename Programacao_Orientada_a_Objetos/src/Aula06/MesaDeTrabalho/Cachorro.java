package Aula06.MesaDeTrabalho;

public class Cachorro {
    private String nome;
    private String raca;
    private int anoNasc;
    private int idade; //obrg para adotar
    private int peso; //obrg para adotar
    private boolean chip; //obrg para adotar
    private boolean ferido; //obrg para adotar
    private boolean apto; //obrg para adotar

    public Cachorro() {};

    public Cachorro(int idade, int peso, boolean chip, boolean ferido){
        this.idade = idade;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.apto = !this.ferido && this.peso > 5;
    };

    public Cachorro(String nome, String raca, int anoNasc, int idade, int peso, boolean chip, boolean ferido){
        this.nome = nome;
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.idade = idade;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
        this.apto = !this.ferido && this.peso > 5;
    };

    public boolean isApto() {
        return apto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    public void adotar(){
        if (this.apto)
            System.out.println("Feliz adoção! Que "+nome+" seja feliz em seu novo lar!");
        else
            System.out.println("Que pena! "+nome+ " não pode ser adotado neste momento.");
    }
}
