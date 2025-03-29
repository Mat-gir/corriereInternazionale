import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Corriere {

    String id = "ID";
    int nID = 0;

    public Corriere() {}

    private Map<String, Spedizione> spedizioni = new HashMap<>();
    private Map<String,Cliente> clienti = new HashMap<>();




    //METODI SPEDIZIONE

    public Map<String, Spedizione> getSpedizioni() {
        return spedizioni;
    }

    public void setSpedizioni(Map<String, Spedizione> spedizioni) {
        this.spedizioni = spedizioni;
    }

    public void aggiungiSpedizione(Spedizione spedizione) {

        spedizione.setID(assegnaId(spedizione.getCliente(), spedizione));
        if(spedizione.getCliente().getAbbonamento()) {
            if(!spedizioni.containsKey(spedizione.getID())){
                spedizioni.put(spedizione.getID(), spedizione);
                ricezione(spedizione);

            }else{
                System.out.println("Spedizione già registrata");
            }
        } else {
            System.out.println("Il cliente non è abbonato");
        }

    }

    

    public String assegnaId(Cliente cliente, Spedizione spedizione){

        String idAssegnato = id + nID;
        nID++;

        return idAssegnato;
    }


    public void ricezione(Spedizione spedizione){
        System.out.print(spedizione.toString() + " è stato ritirato");
    }

    public void rimuoviSpedizione(Spedizione spedizione){
        if(!spedizioni.containsKey(spedizione.getID())){
            spedizioni.remove(spedizione.getID(), spedizione);
            System.out.println("Spedizione rimossa dall'archivio");
        }
    }

    

    public void ricercaSpedizione(String nominativo){
        if(spedizioni.containsKey(nominativo)){
            System.out.println("Spedizione presente nell archivio:");
            System.out.println(spedizioni.get(nominativo).toString());
        }
    }

    public void ricercaSpedizioneCliente(Cliente cliente){
        Iterator<Map.Entry<String, Spedizione>> iterator = spedizioni.entrySet().iterator();
        while(iterator.hasNext()){
            Spedizione spedizione = iterator.next().getValue();
            if(spedizione.getCliente().equals(cliente)){
                System.out.println(spedizione.toString());
            }
        }
    }

    public void ricercaSpedizioneDestinatario(String destinatario){
        Iterator<Map.Entry<String, Spedizione>> iterator = spedizioni.entrySet().iterator();
        while(iterator.hasNext()){
            Spedizione spedizione = iterator.next().getValue();
            if(spedizione.getDestinatario().equals(destinatario)){
                System.out.println(spedizione.toString());
            }
        }
    }

    public void aggiornaSpedizione(String nuovoIndirizzo, Spedizione spedizione){
        if(spedizioni.containsKey(spedizione.getID())){
            spedizioni.get(spedizione.getID()).setIndirizzo(nuovoIndirizzo);
        }else{
            System.out.println("La spedizione che si sta cercando di modificare non è in elenco");
        }
    }

    


    //METODI CLIENTI

    public void aggiungiCliente(Cliente cliente){
        if(cliente.getAbbonamento()){
            if(!clienti.containsKey(cliente.getNome())){
                clienti.put(cliente.getNome(), cliente);
                System.out.println("cliente inserito");

            }
        } else {
            System.out.println("Il cliente non è abbonato");
        }
    }

    public void ricercaCliente(String nominativo){
        if(clienti.containsKey(nominativo)){
            System.out.println("Cliente presente nell archivio:");
            System.out.println(clienti.get(nominativo).toString());
        }
    }

    public Map<String, Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(Map<String, Cliente> clienti) {
        this.clienti = clienti;
    }

    

    public void rimuoviCliente(Cliente cliente){
        if(!clienti.containsKey(cliente.getNome())){
            clienti.remove(cliente.getNome(), cliente);
            System.out.println("cliente rimossa dall'archivio");
        }
    }
}