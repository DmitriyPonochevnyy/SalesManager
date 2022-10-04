public class Main {
    public static void main(String[] args) {
        long[] arr = {5, 7, 4};
        SalesManager salesManager = new SalesManager(arr);
        long max = salesManager.max();
        long min = salesManager.min();
        System.out.println(max);
        System.out.println(min);
        System.out.println(salesManager.getAverageSales());
    }
}
