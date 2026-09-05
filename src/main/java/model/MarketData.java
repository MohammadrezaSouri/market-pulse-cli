package model;

import java.util.ArrayList;
import java.util.List;

public class MarketData {
    private List<GoldPrice> gold =  new ArrayList<>();
    private List<CurrencyPrice> currency = new ArrayList<>();
    private List<CryptoPrice> cryptocurrency = new ArrayList<>();

    public List<GoldPrice> getGold() {
        return gold;
    }

    public MarketData setGold(List<GoldPrice> gold) {
        this.gold = gold;
        return this;
    }

    public List<CurrencyPrice> getCurrency() {
        return currency;
    }

    public MarketData setCurrency(List<CurrencyPrice> currency) {
        this.currency = currency;
        return this;
    }

    public List<CryptoPrice> getCryptocurrency() {
        return cryptocurrency;
    }

    public MarketData setCryptocurrency(List<CryptoPrice> crypto) {
        this.cryptocurrency = crypto;
        return this;
    }
}
