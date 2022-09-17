package Entidade.Pessoas;

import Enumerador.Pessoas.Documento.Tipo;

public class Documento {
    private Tipo tipo;
    private String numero;

    public Documento(Tipo tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo.toString();
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
