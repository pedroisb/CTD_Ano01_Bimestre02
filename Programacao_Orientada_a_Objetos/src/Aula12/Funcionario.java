package Aula12;

public abstract class Funcionario {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cpf, String email, String matricula, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
        this.salario = salario;
    }

    public abstract void pagamento();

    @Override
    public String toString() {
        return "Funcionario" +"\n"+
                "nome='" + nome + '\'' +"\n"+
                "sobrenome='" + sobrenome + '\'' +"\n"+
                "cpf='" + cpf + '\'' +"\n"+
                "email='" + email + '\'' +"\n"+
                "matricula='" + matricula + '\'' +
                '}'+"\n";
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getMatricula() {
        return matricula;
    }
}
