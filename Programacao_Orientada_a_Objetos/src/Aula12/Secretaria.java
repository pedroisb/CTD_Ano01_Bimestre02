package Aula12;

public class Secretaria extends Funcionario{

    private int bonus;

    public Secretaria(String nome, String sobrenome, String cpf, String email, String matricula, double salario) {
        super(nome, sobrenome, cpf, email, matricula, salario);
    }

    @Override
    public void pagamento(){
        double valor = getSalario() + this.bonus;
        System.out.println("Seu salário este mês será de: "+valor);
    }
}
