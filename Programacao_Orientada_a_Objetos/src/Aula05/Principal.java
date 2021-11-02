package Aula05;

public class Principal {

    public static void main(String[] args) {

        Cliente cPedro = new Cliente(16879, "Pedro");
        System.out.println(cPedro.getNome() +" sua dívida é de: "+cPedro.getDivida());

        cPedro.setDivida(200);
        System.out.println("Sua dívida é de: "+""+cPedro.getDivida());

        cPedro.aumentarDivida(500);
        System.out.println("Sua dívida é de: "+""+cPedro.getDivida());

        cPedro.pagarDivida();
        System.out.println("Sua dívida é de: "+""+cPedro.getDivida());
    };
}
