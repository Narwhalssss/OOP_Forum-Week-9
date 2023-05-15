public class Driver {
    public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[6];

        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100", 300.00, 10));
        salesPeople[0].setSalesHistory(new Sales("A200", 1000.00, 2));
        salesPeople[1].setSalesHistory(new Sales("A300", 2550.40, 10));

        System.out.println("Salesperson ID: " + salesPeople[2].getId());
        System.out.println("Number of sales made by salesperson 100: " + salesPeople[0].getCount());
        System.out.println("Value of the first sale made by salesperson 101: " + salesPeople[1].getSalesHistory(0).getValue());
        System.out.println("Total sales for salesperson 100: " + salesPeople[0].calcTotalSales());
    }
}