package view;

import model.CryptoPrice;
import model.CurrencyPrice;
import model.GoldPrice;
import model.MarketData;

public class PriceView {
    public void displayPrice(MarketData marketData) {
        IO.println("GOLD SECTION : ");
        IO.println("-----------------------------");
        for (GoldPrice goldPrice : marketData.getGold()) {
            IO.println(goldPrice.getName() + " : " + goldPrice.getPrice() + " " + goldPrice.getUnit());
        }
        IO.println("-----------------------------");
        IO.println("CURRENCY SECTION : ");
        IO.println("-----------------------------");
        for (CurrencyPrice currency : marketData.getCurrency()) {
            IO.println(currency.getName() + " : " + currency.getPrice() + " " + currency.getUnit());
        }
        IO.println("-----------------------------");
        IO.println("CRYPTO SECTION : ");
        IO.println("-----------------------------");
        for (CryptoPrice cryptoPrice : marketData.getCryptocurrency()) {
            IO.println(cryptoPrice.getName() + " : " + cryptoPrice.getPrice() + " " + cryptoPrice.getUnit());
        }
        IO.println("-----------------------------");
    }
}
