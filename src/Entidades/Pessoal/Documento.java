package Entidades.Pessoal;

public class Documento {
    private String idDocumento;
    private String idPessoa;
    private String tipo;
    private String numero;

    public Documento(String idDocumento, String idPessoa, String tipo, String numero) {
        this.idDocumento = idDocumento;
        this.idPessoa = idPessoa;
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getIdDocumento() {
        return this.idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
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
                " idDocumento='" + getIdDocumento() + "'" +
                ", idPessoa='" + getIdPessoa() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", numero='" + getNumero() + "'" +
                "}";
    }

}
