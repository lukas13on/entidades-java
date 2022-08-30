package Entidades.Pessoal;

public class Endereco {
    private String idEndereco;
    private String idPessoa;
    private String logradouro;
    private String numero;
    private String cep;
    private String estado;
    private String cidade;

    public Endereco(String idEndereco, String idPessoa, String logradouro, String numero, String cep, String estado,
            String cidade) {
        this.idEndereco = idEndereco;
        this.idPessoa = idPessoa;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getIdEndereco() {
        return this.idEndereco;
    }

    public void setIdEndereco(String idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
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

    @Override
    public String toString() {
        return "{" +
                " idEndereco='" + getIdEndereco() + "'" +
                ", idPessoa='" + getIdPessoa() + "'" +
                ", logradouro='" + getLogradouro() + "'" +
                ", numero='" + getNumero() + "'" +
                ", cep='" + getCep() + "'" +
                ", estado='" + getEstado() + "'" +
                ", cidade='" + getCidade() + "'" +
                "}";
    }

}
