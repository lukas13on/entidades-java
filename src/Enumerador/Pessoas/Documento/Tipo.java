package Enumerador.Pessoas.Documento;

public enum Tipo {
    CPF("cpf"),
    CNPJ("cnpj");

    public String tipo;

    Tipo(String param) {
        tipo = param;
    }

    public String toString() {
        return this.tipo;
    }

}
