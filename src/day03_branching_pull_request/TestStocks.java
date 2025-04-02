package day03_branching_pull_request;

public class TestStocks {
    public static void main(String[] args) {
        Stock GoogleStock = new Stock("alphabet Inc Class C","Google",156.06);
        Stock TeslaStock = new Stock("TSLA","Tesla Inc",263.55);
        System.out.println("GoogleStock = " + GoogleStock);
        System.out.println("TeslaStock = " + TeslaStock);
    }

}
