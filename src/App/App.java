package App;

import Controlador.Rotas;
import Entidade.Roteador;

public class App {
    public static void main(String[] args) {

        Rotas rotas = new Rotas();
        Roteador roteador = rotas.getRoteador();
        roteador.iniciar();

    }
}
