package Controlador.Rotas;

import java.util.ArrayList;
import java.util.List;

import Controlador.Rota;
import Visualizador.Rotas.Pessoa;
import Visualizador.Rotas.Produto;

public class Api {
    private List<Rota> rotas = new ArrayList<Rota>();

    public Api() {
        // pessoa
        this.rotas.add(new Rota(Rota.GET, "/pessoa", new Pessoa()));

        // produto
        this.rotas.add(new Rota(Rota.GET, "/produto", new Produto()));
    }

    public List<Rota> getRotas() {
        return this.rotas;
    }

    public void setRotas(List<Rota> rotas) {
        for (int x = 0; x < rotas.size(); x++) {
            this.rotas.add(rotas.get(x));
        }
    }

}
