import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;

public class main {
    public static void main(String[] args) {
        try {
            HttpRequest httpRequest
                    = HttpRequest
                    .newBuilder()
                    .uri(new URI("https://imdb-api.com/en/API/MostPopularMovies/k_60inekob"))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .build()
                    .send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());




        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}
