public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4};
        SalesManager salesManager = new SalesManager(arr);
        int max = salesManager.max();
        int min = salesManager.min();
        System.out.println(max);
        System.out.println(min);
        System.out.println(salesManager.getAverageSales());
    }
}
