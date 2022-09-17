package Enumerador.Pessoas.Contato;

public enum Tipo {
    RESIDENCIAL("residencial"),
    COMERCIAL("comercial");

    public String tipo;

    Tipo(String param) {
        tipo = param;
    }

    public String toString() {
        return this.tipo;
    }

}
