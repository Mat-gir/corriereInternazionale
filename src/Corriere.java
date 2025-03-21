import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corriere {

    public Corriere() {
    }

    private Map<String, Spedizione> spedizioni = new HashMap<>();
    private Map<String,Cliente> clienti = new HashMap<>();



    public void aggiungiSpedizione(Spedizione spedizione) {
        spedizione.setID(assegnaId(spedizione.getCliente(),spedizione));
        if(spedizione.getCliente().getAbbonamento()) {
            if(!spedizioni.containsKey(spedizione.getID())){
                spedizioni.put(spedizione.getID(), spedizione);
                ricezione(spedizione);

            }
        } else {
            throw new IllegalArgumentException("Il cliente non è abbonato");
        }
    }

    public void aggiungiCliente(Cliente cliente){
        if(cliente.getAbbonamento()){
            if(!clienti.containsKey(cliente.getNome())){
                clienti.put(cliente.getNome(), cliente);
                System.out.println("cliente inserito");

            }
        } else {
            throw new IllegalArgumentException("Il cliente non è abbonato");
        }
    }


    String id = "ID";
    int nID = 0;

    public String assegnaId(Cliente cliente,Spedizione spedizione){

        String idAssegnato = id + nID;
        nID++;

        return idAssegnato;
    }


    public void ricezione(Spedizione spedizione){
        System.out.println(spedizione.toString() + " è stato ritirato");
    }

    public void rimuoviSpedizione(Spedizione spedizione){
        if(!spedizioni.containsKey(spedizione.getID())){
            spedizioni.remove(spedizione.getID(), spedizione);
            System.out.println("Spedizione rimossa dall'archivio");
        }
    }

    public void rimuoviCliente(Cliente cliente){
        if(!clienti.containsKey(cliente.getNome())){
            clienti.remove(cliente.getNome(), cliente);
            System.out.println("cliente rimossa dall'archivio");
        }
    }

    public void ricercaSpedizione(String nominativo){
        if(spedizioni.containsKey(nominativo)){
            System.out.println("Spedizione presente nell archivio:");
            System.out.println(spedizioni.get(nominativo).toString());
        }
    }

    public void ricercaCliente(String nominativo){
        if(clienti.containsKey(nominativo)){
            System.out.println("Cliente presente nell archivio:");
            System.out.println(clienti.get(nominativo).toString());
        }
    }

}