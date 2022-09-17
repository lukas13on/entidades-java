package Entidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario extends Modelo {
    protected String idUsuario;
    private String acesso;
    private String senha;
    protected Pessoa pessoa;
    private static final String tabela = "usuario";

    public Usuario(String acesso, String senha) {
        super(tabela);
        this.acesso = acesso;
        this.senha = senha;
    }

    public Usuario(String acesso, String senha, Pessoa pessoa) {
        super(tabela);
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

    public void buscarUsuario() {

    }

    public String criarUsuario() {
        Connection con = this.getBanco().getConexao();
        String sql = "INSERT INTO " + this.getTabela() + " (acesso, senha) VALUES (?, ?)";

        try (PreparedStatement declarar = con.prepareStatement(sql)) {

            // declarar.getParameterMetaData();
            declarar.setString(1, this.getAcesso());
            declarar.setString(2, this.getSenha());

            if (this.pessoa != null) {
                declarar.setString(2, this.pessoa.getNome());
                declarar.setString(2, this.pessoa.getSobrenome());
                declarar.setString(2, this.pessoa.getNascimento());
            }

            if (this.pessoa.documento != null) {
                declarar.setString(2, this.pessoa.documento.getTipo().toString());
                declarar.setString(2, this.pessoa.documento.getNumero());
            }

            if (this.pessoa.contato != null) {
                declarar.setString(2, this.pessoa.contato.getTipo().toString());
                declarar.setString(2, this.pessoa.contato.getEmail());
                declarar.setString(2, this.pessoa.contato.getEmail());
            }

            if (this.pessoa.endereco != null) {

            }

            sql = declarar.toString();
            declarar.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sql;
    }

    public void alterarUsuario() {

    }

    public void pegarUsuario() {

    }

    public void apagarUsuario() {

    }

}
