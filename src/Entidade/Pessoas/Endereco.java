package Entidade.Pessoas;

public class Endereco {

    enum Tipo {
        COMERCIAL(),
        RESIDENCIAL
    }

    private Tipo tipo;
    private String logradouro;
    private String numero;
    private String cep;
    private String estado;
    private String cidade;

    public Endereco(Tipo tipo, String logradouro, String numero, String cep, String estado, String cidade) {
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
