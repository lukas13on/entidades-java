package Entidade;

import java.util.List;

import static spark.Spark.*;

import spark.Route;

public class Roteador {
    private List<Rota> rotas;

    public Roteador() {

    }

    public void registrar(Rota rota) {
        this.rotas.add(rota);
    }

    private void iniciar() {
        for (Rota rota : this.rotas) {
            switch (rota.getMetodo()) {

                case Rota.GET:
                    Route rota = new Route();
                    get("/users", rota.getVisual());
                    break;
                case Rota.POST:
                    break;
                default:
                    // http 400x
                    // pagina nao existe...
                    break;
            }
        }
    }

}
