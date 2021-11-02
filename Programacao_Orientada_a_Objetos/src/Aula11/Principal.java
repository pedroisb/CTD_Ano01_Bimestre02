package Aula11;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraCannon("XX", "wifi", LocalDate.of(2021, 8, 31), 50, 50);

        System.out.println(((ImpressoraCannon)impressora).imprimir());
        System.out.println((impressora).imprimir());
        System.out.println(impressora.imprimir());
    }
}
