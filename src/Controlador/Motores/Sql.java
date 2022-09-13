package Controlador.Motores;

import java.util.ArrayList;
import java.util.List;

import Entidade.Modelo;

public class Sql {
    private Modelo modelo;

    public Sql(Modelo modelo) {
        this.modelo = modelo;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String inserir() {
        String resultado = "";
        String tabela = this.getModelo().getTabela();
        List<String> chaves = new ArrayList<>();
        List<String> valores = new ArrayList<>();
        for (Atributo atributo : this.getModelo().getAtributos()) {
            chaves.add(atributo.getChave());
            valores.add(atributo.getValor());
        }
        resultado = "INSERT INTO" + tabela;
        // System.out.println(resultado);
        return resultado;
    }

}
