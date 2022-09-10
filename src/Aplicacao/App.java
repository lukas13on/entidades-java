package Aplicacao;

import java.util.List;

import Controlador.Rota;
import Controlador.Roteador;
import Controlador.Rotas.Api;

public class App {
    public static void main(String[] args) {
        Api api = new Api();
        List<Rota> rotasApi = api.getRotas();
        Roteador roteador = new Roteador();
        roteador.registrar(rotasApi);
        roteador.iniciar();
    }
}
