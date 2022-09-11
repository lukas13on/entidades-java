package Enumerador.Produtos;

public enum Tipo {
    SIMPLES("simples"),
    COMPOSTO("composto"),
    VARIAVEL("variavel");

    public String tipo;

    Tipo(String param) {
        tipo = param;
    }

    public String get() {
        return this.tipo;
    }

}
