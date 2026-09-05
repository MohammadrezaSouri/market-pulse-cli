package model;

public class CryptoPrice {
    private String symbol, nameEn, name, unit, date, time;
    private String price;
    private String description;
    private long timeUnix;
    private double changePercent;
    private long marketCap;

    public String getTime() {
        return time;
    }

    public CryptoPrice setTime(String time) {
        this.time = time;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public CryptoPrice setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getNameEn() {
        return nameEn;
    }

    public CryptoPrice setNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    public String getName() {
        return name;
    }

    public CryptoPrice setName(String name) {
        this.name = name;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public CryptoPrice setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getDate() {
        return date;
    }

    public CryptoPrice setDate(String date) {
        this.date = date;
        return this;
    }

    public long getTimeUnix() {
        return timeUnix;
    }

    public CryptoPrice setTimeUnix(long timeUnix) {
        this.timeUnix = timeUnix;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public CryptoPrice setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CryptoPrice setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getChangePercent() {
        return changePercent;
    }

    public CryptoPrice setChangePercent(double changeValue) {
        this.changePercent = changeValue;
        return this;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public CryptoPrice setMarketCap(long marketCap) {
        this.marketCap = marketCap;
        return this;
    }
}
