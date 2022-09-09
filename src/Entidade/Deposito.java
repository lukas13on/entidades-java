package Entidade;

public class Deposito {
    private String idDeposito;
    private String nome;

    public Deposito(String idDeposito, String nome) {
        this.idDeposito = idDeposito;
        this.nome = nome;
    }

    public String getIdDeposito() {
        return this.idDeposito;
    }

    public void setIdDeposito(String idDeposito) {
        this.idDeposito = idDeposito;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
