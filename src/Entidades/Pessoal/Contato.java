package Entidades.Pessoal;

public class Contato {
    private String idContato;
    private String idPessoa;
    private String email;
    private String celular;
    private String telefone;

    public Contato(String idContato, String idPessoa, String email, String celular, String telefone) {
        this.idContato = idContato;
        this.idPessoa = idPessoa;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
    }

    public String getIdContato() {
        return this.idContato;
    }

    public void setIdContato(String idContato) {
        this.idContato = idContato;
    }

    public String getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "{" +
                " idContato='" + getIdContato() + "'" +
                ", idPessoa='" + getIdPessoa() + "'" +
                ", email='" + getEmail() + "'" +
                ", celular='" + getCelular() + "'" +
                ", telefone='" + getTelefone() + "'" +
                "}";
    }

}
