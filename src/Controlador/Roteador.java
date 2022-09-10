package Controlador;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

import spark.Route;
import spark.RouteGroup;

public class Roteador {
    private int porta = 4567;
    private List<Rota> rotas = new ArrayList<>();

    public Roteador() {

    }

    public Roteador(Rota rota) {

    }

    public Roteador(List<Rota> rotas) {
        for (int x = 0; x < rotas.size(); x++) {
            this.rotas.add(rotas.get(x));
        }
    }

    public void registrar(Rota rota) {
        this.rotas.add(rota);
    }

    public void registrar(List<Rota> rotas) {
        for (int x = 0; x < rotas.size(); x++) {
            this.rotas.add(rotas.get(x));
        }
    }

    public void iniciar() {

        port(this.porta);

        for (Rota rota : this.rotas) {

            switch (rota.getMetodo()) {

                case Rota.GET:

                    String caminho = rota.getCaminho();

                    Route executar = (requisicao, resposta) -> {
                        rota.getVisual().setResposta(resposta);
                        rota.getVisual().setRequisicao(requisicao);
                        return rota.getVisual().getJSON();
                    };

                    if (rota.getGrupo() != null) {
                        caminho = rota.getGrupo() + rota.getCaminho();
                    }

                    get(caminho, executar);
                    System.out.println("Rota registrada em: " + caminho);
                    System.out.println(rota);

                    break;

                case Rota.POST:
                    break;

                default:
                    // http 400x
                    // pagina nao existe...
                    break;
            }

        }

        System.out.println("Servidor aberto em http://localhost:" + this.porta);
    }

}
