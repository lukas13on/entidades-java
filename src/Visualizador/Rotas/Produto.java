package Visualizador.Rotas;

import com.google.gson.Gson;

import Visualizador.Visualizador;

public class Produto extends Visualizador {

    @Override
    public void get() {
        Entidade.Produto produto = new Entidade.Produto("Smartphone");
        String JSON = new Gson().toJson(produto);
        this.setJSON(JSON);
    }

}
