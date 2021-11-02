package Aula15;

public class Principal {
    public static void main(String[] args) {
        Veleiro v01 = new Veleiro (500.00, 250.00, 2021, 300.00, 6);

        System.out.println("Este veleiro é grande? "+"R: "+v01.veleiroGrande());
        System.out.println("O preço de aluguel foi calculado em: R$"+v01.calcAluguel());

        Iate i01 = new Iate (800.00, 400.00, 2022, 600.00, 10);
        Iate i02 = new Iate (750.00, 350.00, 2019, 400.00, 4);
        Iate i03 = new Iate (750.00, 400.00, 2021, 400.00, 4);

        System.out.println("Este iate é luxuoso? "+"R: "+i01.iateDelux());
        System.out.println("O preço de aluguel foi calculado em: R$"+i01.calcAluguel());

        System.out.println("Este iate é luxuoso? "+"R: "+i02.iateDelux());
        System.out.println("O preço de aluguel foi calculado em: R$"+i02.calcAluguel());

        i01.compareTo(i02);
        i02.compareTo(i01);
        i03.compareTo(i02);
    }
}
