package Lab7_assignment;

public class PizzaOrder { private Pizza item1;
    private Pizza item2;
    private Pizza item3;
    private int orderItems = 0;

    public PizzaOrder(Pizza p1) {
        this.item1 = p1;
        this.orderItems = 1;
    }

    public PizzaOrder(Pizza p1, Pizza p2) {
        this.item1 = p1;
        this.item2 = p2;
        this.orderItems = 2;
    }

    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3) {
        this.item1 = p1;
        this.item2 = p2;
        this.item3 = p3;
        this.orderItems = 3;
    }

    public double calcTotal() {
        double total = 0.0D;
        if (this.orderItems == 1) {
            total = this.item1.calcCost();
        } else if (this.orderItems == 2) {
            total = this.item1.calcCost() + this.item2.calcCost();
        } else if (this.orderItems == 3) {
            total = this.item1.calcCost() + this.item2.calcCost() + this.item3.calcCost();
        } else {
            System.out.println("Max 3 items are allowed per order.");
        }

        return total;
    }
}
