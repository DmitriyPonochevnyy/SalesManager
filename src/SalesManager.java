public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = 100;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int getAverageSales() {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
return (sum - min() - max()) / (sales.length - 2);
    }
}
