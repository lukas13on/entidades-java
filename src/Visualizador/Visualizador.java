package Visualizador;

import spark.Request;
import spark.Response;

public class Visualizador {
    private Request requisicao;
    private Response resposta;
    private String JSON = null;

    /**
     * Inicia o visualizador
     */
    public Visualizador() {
        this.iniciar();
    }

    private void iniciar() {

    }

    public Request getRequisicao() {
        return this.requisicao;
    }

    public void setRequisicao(Request requisicao) {
        this.requisicao = requisicao;
    }

    public Response getResposta() {
        return this.resposta;
    }

    public void setResposta(Response resposta) {
        this.resposta = resposta;
    }

    public String getJSON() {

        return this.JSON;
    }

    public void setJSON(String JSON) {
        this.JSON = JSON;
    }

    public void get() {
        this.setJSON("{}");
    }

    public void post() {
        this.setJSON("{}");
    }

    @Override
    public String toString() {
        return "{" +
                " requisicao='" + getRequisicao() + "'" +
                ", resposta='" + getResposta() + "'" +
                "}";
    }

}
