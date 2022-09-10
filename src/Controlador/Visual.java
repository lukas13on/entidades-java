package Controlador;

import spark.Request;
import spark.Response;

public class Visual {
    private Request requisicao;
    private Response resposta;
    private String JSON = null;

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

    @Override
    public String toString() {
        return "{" +
                " requisicao='" + getRequisicao() + "'" +
                ", resposta='" + getResposta() + "'" +
                "}";
    }

}
