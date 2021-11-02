package Aula14;

public class Principal {
    public static void main(String[] args) {

        Jogador silas = new Jogador(10,"Silas", false, true);
        Jogador sophia = new Jogador(9,"Sophia",false,true);

        Equipe turma02 = new Equipe("Turma02");

        turma02.addJogador(silas);
        turma02.addJogador(sophia);

        turma02.mostrarTitulares();
        turma02.mostrarLesionados();
    }
}
