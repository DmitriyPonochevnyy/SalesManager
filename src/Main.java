public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4};
        SalesManager salesManager = new SalesManager(arr);
        int max = salesManager.max();
        System.out.println(max);
        System.out.println(salesManager.getAverageSales());
    }
}
