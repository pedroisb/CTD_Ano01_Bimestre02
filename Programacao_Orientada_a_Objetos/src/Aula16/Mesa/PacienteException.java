package Aula16.Mesa;

public class PacienteException extends Exception {

    public PacienteException(String message){
        super(message);
    }

    @Override
    public String toString(){
        return "A seguinte exceção ocorreu: "+getClass().getName() + "\n Mensagem: "+getMessage();
    }
}
