package Visualizador.Rotas;

import com.google.gson.Gson;

import Entidade.Visualizador;
import Enumerador.Motor.Atributo;

public class Usuario extends Visualizador {

    @Override
    public void get() {
        Gson gson = new Gson();
        Entidade.Usuario usuario = new Entidade.Usuario("lukas13on", "123456");
        // System.out.println(usuario.test());
        this.setJSON("xablau");
        for (Atributo atributo : usuario.test()) {
            System.out.println(atributo.getChave());
        }
        if (true) {
            return;
        }
        System.out.println(usuario.toString());
        // usuario.showFields(Entidade.Usuario.class);
        // if (true) {
        // return;
        // }
        String SQL = usuario.toSQL();
        String JSON = gson.toJson(usuario);
        this.setJSON(JSON);
    }

}
