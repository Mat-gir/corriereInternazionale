public class Cliente {
    private String nome;
    private boolean abbonamento;

    public Cliente(String nome, boolean abbonamento) {
        this.nome = nome;
        this.abbonamento = abbonamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(boolean abbonamento) {
        this.abbonamento = abbonamento;
    }

    @Override
    public String toString() {
        String statoAbbonamento;
        if(abbonamento == true){
            statoAbbonamento = "attivo";
        }else{
            statoAbbonamento = "scaduto";
        }
        return "nome: " + nome  + ", abbonamento: " + statoAbbonamento;
    }
}
