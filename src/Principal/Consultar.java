package Principal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Consultar {
    private double valorARS;
    private double valorBRL;
    private double valorCOP;
    private double valorUSD;

    public void obtenerDivisa() {
        try {
            String url = "https://v6.exchangerate-api.com/v6/343e62d66869bd060cf7b291/latest/USD";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonobj = JsonParser.parseString(response.body()).getAsJsonObject();

            JsonObject conversionRates = jsonobj.getAsJsonObject("conversion_rates");

            valorARS = conversionRates.get("ARS").getAsDouble();
            valorBRL = conversionRates.get("BRL").getAsDouble();
            valorCOP = conversionRates.get("COP").getAsDouble();
            valorUSD = conversionRates.get("USD").getAsDouble();

        } catch (Exception e) {
            System.out.println("Error al obtener divisas: " + e.getMessage());
        }
    }

    public double getValorARS() {
        return valorARS;
    }

    public double getValorBRL() {
        return valorBRL;
    }

    public double getValorCOP() {
        return valorCOP;
    }

    public double getValorUSD() {
        return valorUSD;
    }
}