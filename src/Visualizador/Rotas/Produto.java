package Visualizador.Rotas;

import com.google.gson.Gson;

import Entidade.Visualizador;

public class Produto extends Visualizador {

    @Override
    public void get() {

        Entidade.Produto produto = new Entidade.Produto("Smartphone",
                "Um smartphone ideal para você que quer gastar pouco...",
                1000.50);

        String JSON = new Gson().toJson(produto);
        this.setJSON(JSON);
    }

}
