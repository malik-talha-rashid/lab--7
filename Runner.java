package Lab7_assignment;

public class Runner { public Runner() {
}

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Large", 2, 2, 1);
        Pizza p2 = new Pizza("Medium", 3, 1, 1);
        PizzaOrder order1 = new PizzaOrder(p1, p2);
        System.out.println("Total cost: " + order1.calcTotal());
    }
}
