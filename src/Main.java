public class Main {
    public static void main(String[] args) {
        Corriere corriereInterzionale = new Corriere();
        Cliente cliente = new Cliente("Piero Ciampi",true);
        Spedizione nuovaSpedizione = new Spedizione(cliente,"via dei matti 0","Genova","Italia","3397585442");
        corriereInterzionale.aggiungiCliente(cliente);
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione);
    }


}