package Aula10;

public class Principal {
    public static void main(String[] args) {
        Associado associado = new Associado("156A", "Yana", 150, "Musculação");

        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("654E", "JP", "Dança", 150, 25);
        associadoHabilitado.setHabilitado(true);
        associadoHabilitado.valorMensal = 100;


        System.out.println(associado.custo());
        System.out.println(associadoHabilitado.custo());
    }
}
