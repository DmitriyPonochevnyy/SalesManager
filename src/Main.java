public class Main {
    public static void main(String[] args) {
        long[] arr = {5, 7, 4};
        SalesManager salesManager = new SalesManager(arr);
        long max = salesManager.max();
        System.out.println(max);
    }
}
