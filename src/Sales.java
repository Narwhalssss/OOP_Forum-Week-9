public class Sales {
    private String itemId;
    private double value;
    private int quantity;

    public Sales(String itemId, double value, int quantity) {
        this.itemId = itemId;
        this.value = value;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }
}