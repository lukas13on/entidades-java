package Enumerador.Pessoas.Endereco;

public enum Tipo {
    RESIDENCIAL("residencial"),
    COMERCIAL("comercial");

    public String tipo;

    Tipo(String param) {
        tipo = param;
    }

    public String get() {
        return this.tipo;
    }

}
