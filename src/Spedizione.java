public class Spedizione {
    private String ID;
    private Cliente cliente;
    private String destinatario;
    private String indirizzo;
    private String città;
    private String nazione;
    private String telefono;
    private String CAP;

    public Spedizione(Cliente cliente, String indirizzo, String città, String nazione, String telefono,String CAP,String destinatario) {
        this.cliente = cliente;
        this.indirizzo = indirizzo;
        this.città = città;
        this.nazione = nazione;
        this.telefono = telefono;
        this.CAP = CAP;
        this.destinatario = destinatario;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public String getCAP(){
        return CAP;
    }

    public void setCAP(String CAP){
        this.CAP = CAP;
    }

    @Override
    public String toString() {
        return "ID: " + ID +"\n" +
                "Mittente: " + cliente +"\n" +
                "Destinarario: "+ destinatario+"\n"+
                "Nazione: " +nazione +"\n" +
                "Città: " +città + "\n" +
                "Indirizzo: " +indirizzo +"\n"+
                "Telefono: " +telefono + "\n";
    }


}
