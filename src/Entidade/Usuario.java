package Entidade;

public class Usuario {
    private String idUsuario;
    private String acesso;
    private String senha;
    protected Pessoa pessoa;

    public Usuario(String idUsuario, String acesso, String senha, Pessoa pessoa) {
        this.idUsuario = idUsuario;
        this.acesso = acesso;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public String getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
