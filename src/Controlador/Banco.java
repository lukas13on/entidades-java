package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class Banco {
    protected Connection conexao;
    private String usuario = "root";
    private String senha = "";

    public Banco() {
        this.conectar();
    }

    private void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Connection getConexao() {
        return this.conexao;
    }
}
