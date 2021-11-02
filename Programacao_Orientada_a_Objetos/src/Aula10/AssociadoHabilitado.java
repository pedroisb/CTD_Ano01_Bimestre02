package Aula10;

public class AssociadoHabilitado extends Associado{

    private double custoPiscina;
    private boolean habilitado;

    AssociadoHabilitado(String numAssociado, String nome, String atividade, double valorMensal, double custoPiscina){
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public double custo() {
        if (this.habilitado)
            return super.valorMensal + this.custoPiscina; //Em sendo protected, posso chamar o atributo da
            // classe-pai (principal) pelo seu nome. Do contrário, no contexto deste exercício, eu deveria chamar o
            // método custo(), que é público. Em sendo a o atributo publico, eu poderia acessá-lo com o get().
        else
            return super.custo();
    }
}
