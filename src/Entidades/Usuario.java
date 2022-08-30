package Entidades;

public class Usuario extends Modelo {
    private String id;
    private String acesso;
    private String senha;
    protected Pessoa pessoa;

    public Usuario(String id, String acesso, String senha, Pessoa pessoa) {
        this.id = id;
        this.acesso = acesso;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public String getAcesso() {
        return this.acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", acesso='" + getAcesso() + "'" +
                ", senha='" + getSenha() + "'" +
                ", pessoa='" + getPessoa() + "'" +
                "}";
    }

}
