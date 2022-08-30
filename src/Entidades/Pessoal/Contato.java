package Entidades.Pessoal;

public class Contato {
    private String id;
    private String idPessoa;
    private String email;
    private String celular;
    private String telefone;

    public Contato(String id, String idPessoa, String email, String celular, String telefone) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
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

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", idPessoa='" + getIdPessoa() + "'" +
                ", email='" + getEmail() + "'" +
                ", celular='" + getCelular() + "'" +
                ", telefone='" + getTelefone() + "'" +
                "}";
    }

}
