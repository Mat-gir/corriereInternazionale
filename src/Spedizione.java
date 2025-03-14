public class Spedizione {
    private String ID;
    private Cliente cliente;
    private String indirizzo;
    private String città;
    private String nazione;
    private String telefono;

    public Spedizione(Cliente cliente, String indirizzo, String città, String nazione, String telefono) {
        this.cliente = cliente;
        this.indirizzo = indirizzo;
        this.città = città;
        this.nazione = nazione;
        this.telefono = telefono;
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

    @Override
    public String toString() {
        return "ID: " + ID +"\n" +
                "Cliente: " + cliente +"\n" +
                "Nazione: " +nazione +"\n" +
                "Città: " +città + "\n" +
                "Indirizzo: " +indirizzo +"\n"+
                "Telefono: " +telefono + "\n";
    }


}
