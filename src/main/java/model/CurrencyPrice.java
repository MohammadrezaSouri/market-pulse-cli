package model;

public class CurrencyPrice {

     private String symbol, nameEn, name, unit, date, time;
        private long timeUnix;
        private long price;
        private long changeValue;
        private double changePercent;

    public String getTime() {
        return time;
    }

    public CurrencyPrice setTime(String time) {
        this.time = time;
        return this;
    }

    public String getDate() {
            return date;
        }

        public CurrencyPrice setDate(String date) {
            this.date = date;
            return this;
        }

        public long getTimeUnix() {
            return timeUnix;
        }

        public CurrencyPrice setTimeUnix(long timeUnix) {
            this.timeUnix = timeUnix;
            return this;
        }

        public String getSymbol() {
            return symbol;
        }

        public CurrencyPrice setSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public String getNameEn() {
            return nameEn;
        }

        public CurrencyPrice setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }

        public String getName() {
            return name;
        }

        public CurrencyPrice setName(String name) {
            this.name = name;
            return this;
        }

        public String getUnit() {
            return unit;
        }

        public CurrencyPrice setUnit(String unit) {
            this.unit = unit;
            return this;
        }

        public long getPrice() {
            return price;
        }

        public CurrencyPrice setPrice(long price) {
            this.price = price;
            return this;
        }

        public long getChangeValue() {
            return changeValue;
        }

        public CurrencyPrice setChangeValue(long changeValue) {
            this.changeValue = changeValue;
            return this;
        }

        public double getChangePercent() {
            return changePercent;
        }

        public CurrencyPrice setChangePercent(double changePercent) {
            this.changePercent = changePercent;
            return this;
        }
}
