package Visualizador.Rotas;

import com.google.gson.Gson;

import Entidade.Visualizador;

public class Usuario extends Visualizador {

    @Override
    public void get() {

        Gson gson = new Gson();
        Entidade.Usuario usuario = new Entidade.Usuario("lukas13on", "123456");

        // usuario.toSql().inserir();
        this.setJSON(usuario.toSql().inserir());
        // System.out.println(usuario.test());
        // this.setJSON("xablau");
        // for (Atributo atributo : usuario.getAtributos()) {
        // System.out.println("Chave:" + atributo.getChave());
        // System.out.println("Valor:" + atributo.getValor());
        // }
        // System.out.println(usuario.toString());
        // usuario.showFields(Entidade.Usuario.class);
        // if (true) {
        // return;
        // }
        // String SQL = usuario.toSQL();
        // String JSON = gson.toJson(usuario);
        // this.setJSON(JSON);
    }

}
