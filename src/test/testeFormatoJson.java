package test;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class testeFormatoJson {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://imdb-api.com/en/API/MostPopularMovies/k_60inekob"))
                .GET()
                .build();

                HttpResponse<String> response = httpClient.send(request,
                HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));

        //System.out.println("Status Code: " + response.statusCode());
        //System.out.println("Headers    : " + response.headers().toString());
        System.out.println(response.body());
    }
}
