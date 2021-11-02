package Aula12;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj;
    //private Funcionario funcionario;
    // associação -> "uma empresa tem um funcionário". Porém, aqui se limitaria a
    // apenas 01 objeto do tipo funcionário.
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    //array é a forma para armazenar vários obj func
    //ao se referir ao objeto abstrato, permite-se armazenar seus descendentes (ex: secretaria e vendedor)

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void cadastrar(Funcionario funcionario){
        this.listaFuncionario.add(funcionario);
        if (listaFuncionario.add(funcionario))
            System.out.println("Funcionário " + funcionario + "foi cadastrado com sucesso");
    }

    public void listar(){
        for (int i = 0; i < listaFuncionario.size(); i++){
            System.out.println(listaFuncionario.get(i).toString());
        }
    }

    public void remover (Funcionario funcionario){
        listaFuncionario.remove(funcionario);
        if (listaFuncionario.remove(funcionario))
            System.out.println(funcionario.getNome()+" foi removido com sucesso");
        else
            System.out.println("Falha na remoção");
    }



    //Java demanda métodos específicos para manipulação do array
}
