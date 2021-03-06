package Aula12;

public class Vendedor extends Funcionario{

    private double comissao;

    public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula, double salario, double comissao) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.comissao = comissao;
    }

    public double calcularComissao(int vendas){
        this.comissao = vendas * 50;
        return this.comissao;
    }

    @Override
    public void pagamento() {
        double valor = getSalario() + this.comissao;
        System.out.println("Seu salário este mês será de: " + valor);
        //ao se colocar os parênteses, o Java distingue a soma de concatenação no sout
    }
}
