package Controlador.Rotas;

import java.util.ArrayList;
import java.util.List;

import Controlador.Rota;
import Visualizador.Pessoa;
import Visualizador.Produto;

public class Api {
    private String grupo = "/api";
    private List<Rota> rotas = new ArrayList<>();

    public Api() {
        this.carregar();
    }

    private void carregar() {
        List<Rota> rotas = new ArrayList<Rota>();

        // pessoa
        rotas.add(new Rota(Rota.GET, "/pessoa", new Pessoa()));

        // produto
        rotas.add(new Rota(Rota.GET, "/produto", new Produto()));

        this.setRotas(rotas);
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<Rota> getRotas() {
        return this.rotas;
    }

    public void setRotas(List<Rota> rotas) {
        for (int x = 0; x < rotas.size(); x++) {
            rotas.get(x).setGrupo(this.grupo);
            this.rotas.add(rotas.get(x));
        }
    }

}
