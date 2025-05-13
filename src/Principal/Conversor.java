package Principal;

public class Conversor {

    public static void mostrarMenu() {
        System.out.println("""
                *****************************************************
                Bienvenido al conversor de moneda. Elija una de las opciones:
                1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dólar
                3) Dólar ==> Real Brasileño
                4) Real Brasileño ==> Dólar
                5) Dólar ==> Peso Colombiano
                6) Peso Colombiano ==> Dólar
                7) Salir
                *****************************************************
                """);
    }

    public static double convertir(double valor, double divisa) {
        return valor * divisa;
    }

    public static double convertirInverso(double valor, double divisa) {
        return valor / divisa;
    }


}
