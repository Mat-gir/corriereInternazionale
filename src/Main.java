import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Corriere corriereInterzionale = new Corriere();
        popolaArchivio(corriereInterzionale);
        ordineAlfabetico(corriereInterzionale);
    }

    public static void ordineAlfabetico(Corriere corriereInterzionale) {
        Cliente [] clientiArray = corriereInterzionale.getClienti().values().toArray(new Cliente[0]);
        ArrayList<Cliente> clienti = new ArrayList();
        for(int i = 0; i < clientiArray.length;i++){
            clienti.add(clientiArray[i]);
        }
        
       clienti.sort(Comparator.comparing(p -> p.getNome()));

        for(int i = 0; i < clienti.size(); i++){
            System.out.println(clienti.get(i).toString());
        }
        
    }


    public static void popolaArchivio(Corriere corriereInterzionale){

        // primo cliente
        Cliente cliente = new Cliente("Piero Ciampi",true);
        Spedizione nuovaSpedizione = new Spedizione(cliente,"via dei matti 0","Genova","Italia","3397585442","16100","Vincenzo Tempera");
        corriereInterzionale.aggiungiCliente(cliente);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione);

        // secondo cliente
        Cliente cliente2 = new Cliente("Gino Freddi",true);
        Spedizione nuovaSpedizione2 = new Spedizione(cliente,"via bernini 7","Noale","Italia","389006589","30033","Alberico Vannucci");
        corriereInterzionale.aggiungiCliente(cliente2);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione2);

        // terzo cliente
        Cliente cliente3 = new Cliente("Emma Boldi",true);
        Spedizione nuovaSpedizione3 = new Spedizione(cliente,"via civetta 19","Trapani","Italia","389006589","91100","Fausto Garza");
        corriereInterzionale.aggiungiCliente(cliente3);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione3);

        // quarto cliente
        Cliente cliente4 = new Cliente("Guido Galasso",true);
        Spedizione nuovaSpedizione4 = new Spedizione(cliente,"via primavera 48","Como","Italia","389006589","22100","Giuseppe Marni");
        corriereInterzionale.aggiungiCliente(cliente4);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione4);

        // quinto cliente
        Cliente cliente5 = new Cliente("Joana Bells",true);
        Spedizione nuovaSpedizione5 = new Spedizione(cliente,"Lincoln Street n.34","Chicago","USA","389006589","60007","Tyler Hallborne");
        corriereInterzionale.aggiungiCliente(cliente5);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione5);

        // sesto cliente
        Cliente cliente6 = new Cliente("Ahmad Al-Jaiff",false);
        Spedizione nuovaSpedizione6 = new Spedizione(cliente,"Viligance Street n.8","New York","USA","389006589","07008","Shekinah Al - Jaiff");
        corriereInterzionale.aggiungiCliente(cliente6);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione6);

        // Sette cliente
        Cliente cliente7 = new Cliente("Jean Bodin",true);
        Spedizione nuovaSpedizione7 = new Spedizione(cliente,"Rue de la egualiance n.27","Parigi","Francia","389006589","70123","Jean-Jacques Roussaeu");
        corriereInterzionale.aggiungiCliente(cliente7);
        System.out.println("");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione7);

        // Otto cliente
        Cliente cliente8 = new Cliente("Franz Kraftwerk",true);
        Spedizione nuovaSpedizione8 = new Spedizione(cliente,"","Berlino","Germania","389006589","10115","Karlheinz Stockhausen");
        corriereInterzionale.aggiungiSpedizione(nuovaSpedizione8);
        System.out.println("");
        corriereInterzionale.aggiungiCliente(cliente8);
    }


}