package Aula05.Atividade;

public class Principal {
    public static void main(String[] args) {
        UsuarioJogo jogadorUm = new UsuarioJogo("Pedro", "Bigodon");
        UsuarioJogo jogadorDois = new UsuarioJogo("Ivo", "Ivo");

        jogadorUm.subirNivel();
        jogadorUm.subirNivel();
        jogadorUm.subirNivel();
        System.out.println("Seu nível é: "+""+jogadorUm.getNivel());

        jogadorDois.subirNivel();
        System.out.println("Seu nível é: "+""+jogadorDois.getNivel());

        jogadorUm.aumentarPontuacao();
        jogadorUm.aumentarPontuacao();
        jogadorUm.aumentarPontuacao();
        jogadorUm.bonus(2);
        System.out.println("Sua pontuação é: "+""+jogadorUm.getPontuacao());

        jogadorUm.aumentarPontuacao();
        System.out.println("Sua pontuação é: "+""+jogadorDois.getPontuacao());


    }
}
