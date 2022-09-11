package Controlador;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

import spark.Route;

public class Roteador {
    private int porta = 4567;
    private List<Rota> rotas = new ArrayList<Rota>();

    /**
     * Inica o roteador sem nenhuma rota
     */
    public Roteador() {

    }

    /**
     * Inicia o roteador com uma unica rota
     * 
     * @param rota Rota
     */
    public Roteador(Rota rota) {

    }

    /**
     * Inicia o roteador com uma lista de rotas
     * 
     * @param rotas Lista de rotas
     */
    public Roteador(List<Rota> rotas) {
        for (int x = 0; x < rotas.size(); x++) {
            this.rotas.add(rotas.get(x));
        }
    }

    /**
     * Registra uma unica rota
     * 
     * @param rota Rota
     */
    public void registrar(Rota rota) {
        this.rotas.add(rota);
    }

    /**
     * Registra uma lista de rotas
     * 
     * @param rotas Lista de rotas
     */
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
                        rota.getVisual().get();
                        return rota.getVisual().getJSON();
                    };

                    get(caminho, executar);
                    System.out.println("[GET]" + caminho);
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

        System.out.println("Servidor aberto http://localhost:" + this.porta);
    }

}
