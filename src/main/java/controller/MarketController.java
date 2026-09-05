package controller;

import exception.MarketDataFetchException;
import view.PriceView;
import model.MarketData;
import service.MarketDataService;

import java.io.IOException;

public class MarketController {
    private MarketController(){}
    private final static MarketController marketController = new MarketController();
    public static MarketController getMarketController() {
        return marketController;
    }

    private final MarketDataService marketDataService =  MarketDataService.getInstance();
    private final PriceView priceView  = new PriceView();

    public void showAllPrices() {
         try {
             MarketData data = marketDataService.fetchMarketData();
             priceView.displayPrice(data);

         } catch (IOException | InterruptedException e) {
             throw new MarketDataFetchException("Market Data Fetch Exception " + e.getMessage());
         }
    }
}
