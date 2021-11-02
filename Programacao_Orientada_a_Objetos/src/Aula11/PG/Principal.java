package Aula11.PG;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

       Cliente pedro = new Cliente(198816, "Brito", "7156894", "0165465146");


       ContaPoupanca contaP = new ContaPoupanca(1150.50, pedro, 0.05);
       contaP.obterRendimentos();
       contaP.sacar(1000.00);
       contaP.relatarSaldo();
       contaP.sacar(1000.00);
       contaP.relatarSaldo();
       contaP.obterRendimentos();

       ContaCorrente contaC = new ContaCorrente(425.60, pedro, 2500.00);
       contaC.depositar(500.00);
       contaC.relatarSaldo();
       contaC.sacar(3000.00);
       contaC.relatarSaldo();
       contaC.sacar(3000.00);
       contaC.relatarSaldo();
    }
}
