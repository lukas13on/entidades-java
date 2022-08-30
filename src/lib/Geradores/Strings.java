package lib.Geradores;

public class Strings {

    public static String NUMEROS = "0123456789";
    public static String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String gerar(int tamanho) {
        String resultado = "";
        String[] letras = LETRAS.split("");
        String[] numeros = NUMEROS.split("");
        int i = 0;

        while (i <= tamanho) {
            int rnd = lib.Geradores.Inteiros.gerar(0, 2);
            boolean letra = rnd == 0 ? true : false;
            if (letra) {
                int _rnd = lib.Geradores.Inteiros.gerar(0, 2);
                boolean minusculo = _rnd == 0 ? true : false;
                int __rnd = lib.Geradores.Inteiros.gerar(0, letras.length - 1);
                resultado += minusculo == true ? letras[__rnd].toLowerCase() : letras[__rnd];
            } else {
                int __rnd = lib.Geradores.Inteiros.gerar(0, numeros.length - 1);
                resultado += numeros[__rnd];
            }
            i++;
        }

        return resultado;
    }

}