package Visualizador.Rotas;

import com.google.gson.Gson;

import Visualizador.Visualizador;

public class Pessoa extends Visualizador {

    @Override
    public void get() {
        Entidade.Pessoa pessoa = new Entidade.Pessoa("Lucas");
        String JSON = new Gson().toJson(pessoa);
        this.setJSON(JSON);
    }

}
