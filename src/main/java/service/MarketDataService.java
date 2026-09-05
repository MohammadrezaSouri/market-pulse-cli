package service;

import exception.MarketDataFetchException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import model.MarketData;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MarketDataService {
    private final static MarketDataService marketDataService = new MarketDataService();
    private MarketDataService() {}
    public static MarketDataService getInstance() {
        return marketDataService;
    }

    private static final String API = "https://brsapi.ir/Api/Market/Sample/FreeApi_Gold_Currency.json";
    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);

    public MarketData fetchMarketData() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API)).GET().build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new MarketDataFetchException("HTTP ERROR CODE: " + response.statusCode());
        }

        String jsonBody = response.body();
        return objectMapper.readValue(jsonBody, MarketData.class);
    }
}
