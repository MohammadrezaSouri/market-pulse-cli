package view;

import controller.MarketController;

import java.io.IOException;

public class Main {
    static void main() {
        IO.println("Welcome to the Market Price ");
        IO.println("******************************");
        try {
            MarketController.getMarketController().showAllPrices();
        }catch (Exception e){
            IO.println("Error, we have some problem please try again later  : " + e.getMessage());
        }
    }
}
