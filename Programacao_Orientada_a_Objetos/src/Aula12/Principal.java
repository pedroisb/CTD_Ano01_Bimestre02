package Aula12;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("DH", "68525");
        Funcionario funcionario1 = new Gerente("José", "Silva", "5555", "contatao@email", "15691", 10000, 50);
        //Em funcionario1 pode-se ver um caso de CASTING IMPLÍCITO. Cria-se uma variável do tipo abstrato Funcionario, com casting para o tipo mais específico Gerente.
        //A vantagem de implementar o casting é que, caso eu deseje realocar os valores em outro tipo de variável (escalabilidade), basta chamar a variável e redefinir, ex: "funcionario1 = new Vendedor"

        //dh.cadastrar(funcionario1);
        //funcionario1.pagamento();
        //dh.listar();
        dh.remover(funcionario1);
        dh.listar();

    }
}
