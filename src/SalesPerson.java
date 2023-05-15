public class SalesPerson {
    private String id;
    private Sales[] salesHistory;
    private int count;

    public SalesPerson(String id) {
        this.id = id;
        this.salesHistory = new Sales[100]; // Assuming a maximum of 100 sales
        this.count = 0;
    }

    public void setSalesHistory(Sales sale) {
        salesHistory[count] = sale;
        count++;
    }

    public double calcTotalSales() {
        double totalSales = 0.0;
        for (int i = 0; i < count; i++) {
            totalSales += salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return totalSales;
    }

    public Sales largestSale() {
        Sales largestSale = null;
        double maxSaleValue = 0.0;
        for (int i = 0; i < count; i++) {
            if (salesHistory[i].getValue() > maxSaleValue) {
                largestSale = salesHistory[i];
                maxSaleValue = salesHistory[i].getValue();
            }
        }
        return largestSale;
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public Sales getSalesHistory(int index) {
        return salesHistory[index];
    }
}