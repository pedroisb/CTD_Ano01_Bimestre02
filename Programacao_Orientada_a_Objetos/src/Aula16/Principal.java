package Aula16;

public class Principal {
    public static void main(String[] args) throws ClienteException {
        Cliente cliente = new Cliente("Silas", "Medeiros", "684326543", 500.00);
        try {
            cliente.comprar(500);
        }catch(ClienteException e){
            e.printStackTrace();
            System.err.println(e.toString());
        }
    }
}
