package Visualizador.Rotas;

import com.google.gson.Gson;

import Entidade.Pessoa;
import Entidade.Visualizador;

public class Usuario extends Visualizador {

    @Override
    public void get() {

        Gson gson = new Gson();

        Entidade.Pessoa pessoa = new Pessoa("Lucas");
        Entidade.Usuario usuario = new Entidade.Usuario("lukas13on", "123456", pessoa);

        // usuario.toSql().inserir();
        this.setJSON(usuario.criarUsuario());
    }

}
