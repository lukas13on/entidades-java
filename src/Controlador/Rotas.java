package Controlador;

import Entidade.Rota;
import Entidade.Roteador;
import Visual.Inicio;
import Visual.Sobre;

public class Rotas {
        private Roteador roteador = new Roteador();

        public Rotas() {

                // inicio
                Inicio visualInicio = new Inicio();
                Rota rotaInicio = new Rota(Rota.GET, "/", visualInicio);
                this.getRoteador().registrar(rotaInicio);

                // sobre
                Sobre visualSobre = new Sobre();
                Rota rotaSobre = new Rota(Rota.GET, "/", visualSobre);
                this.getRoteador().registrar(rotaSobre);

        }

        public Roteador getRoteador() {
                return this.roteador;
        }

        public void setRoteador(Roteador roteador) {
                this.roteador = roteador;
        }

}