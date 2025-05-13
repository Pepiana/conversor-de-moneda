package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion;
        Consultar consulta = new Consultar();
        consulta.obtenerDivisa();
        List<String> historial = new ArrayList<>();

        while (true) {
            Conversor.mostrarMenu();
            opcion = lectura.nextInt();

            if (opcion == 7) {
                System.out.println("¡Gracias por usar el conversor!");
                break;
            }

            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no valida. Intente nuevamente.");
                continue;
            }
            System.out.print("Ingresa el valor que deseas convertir: ");
            double valor = lectura.nextDouble();
            switch (opcion) {

                case 1:
                    double resultado1 = Conversor.convertir(valor, consulta.getValorARS());
                    String historial1 = "El valor " + valor + "[USD] corresponde al valor final de: " + resultado1 + "[ARS]";
                    System.out.println(historial1);
                    historial.add(historial1);
                    break;
                case 2:
                    double resultado2 = Conversor.convertirInverso(valor, consulta.getValorARS());
                    String historial2 = "El valor " + valor + "[ARS] corresponde al valor final de: " + resultado2 + "[USD]";
                    System.out.println(historial2);
                    historial.add(historial2);
                    break;
                case 3:
                    double resultado3 = Conversor.convertir(valor, consulta.getValorBRL());
                    String historial3 = "El valor " + valor + "[USD] corresponde al valor final de: " + resultado3 + "[BRL]";
                    System.out.println(historial3);
                    historial.add(historial3);
                    break;
                case 4:
                    double resultado4 = Conversor.convertirInverso(valor, consulta.getValorBRL());
                    String historial4 = "El valor " + valor + "[BRL] corresponde al valor final de: " + resultado4 + "[USD]";
                    System.out.println(historial4);
                    historial.add(historial4);
                    break;
                case 5:
                    double resultado5 = Conversor.convertir(valor, consulta.getValorCOP());
                    String historial5 = "El valor " + valor + "[USD] corresponde al valor final de: " + resultado5 + "[COP]";
                    System.out.println(historial5);
                    historial.add(historial5);
                    break;
                case 6:
                    double resultado6 = Conversor.convertirInverso(valor, consulta.getValorCOP());
                    String historial6 = "El valor " + valor + "[COP] corresponde al valor final de: " + resultado6 + "[USD]";
                    System.out.println(historial6);
                    historial.add(historial6);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("\n--- Historial de conversiones ---");
        for (String registro : historial) {
            System.out.println(registro);
        }
    }
}
