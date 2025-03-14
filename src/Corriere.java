import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Corriere {

    public Corriere() {
    }

    Map<String, Spedizione> spedizioni = new HashMap<>();
    List<Cliente> clienti = new ArrayList<>();



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
            clienti.add(cliente);
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

}