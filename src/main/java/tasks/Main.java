package tasks;

import tasks.task9_05_12_2017.producerConsumer.entities.*;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(2);
        Street street = new Street();
        Truck truck = new Truck();

        ProductCounter productCounter = new ProductCounter(truck);
        TruckLoader truckLoader = new TruckLoader(street, truck, productCounter);
        StockStealer stockStealer = new StockStealer(stock, street, truckLoader);

        new Thread(productCounter).start();
        new Thread(truckLoader).start();
        new Thread(stockStealer).start();

//        System.out.println("\n" + stock.getProduct());
//        System.out.println(street.getProduct());
//        System.out.println(truck.getProduct());
    }
}
