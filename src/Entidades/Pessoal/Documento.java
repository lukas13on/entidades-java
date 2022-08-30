package Entidades.Pessoal;

public class Documento {
    private String id;
    private String idPessoa;
    private String tipo;
    private String numero;

    public Documento(String id, String idPessoa, String tipo, String numero) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", idPessoa='" + getIdPessoa() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", numero='" + getNumero() + "'" +
                "}";
    }
}
