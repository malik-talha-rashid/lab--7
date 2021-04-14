package Lab7_assignment;

public class Pizza {    private int noOfCheeseToppings;
    private int noOfPepperoniToppings;
    private int noOfHamToppings;
    private double cost;

    public Pizza() {
        this("Small", 1, 1, 1);
    }

    public Pizza(String size, int noOfCheeseToppings, int noOfPepperoniToppings, int noOfHamToppings) {
        this.size = size;
        this.noOfCheeseToppings = noOfCheeseToppings;
        this.noOfPepperoniToppings = noOfPepperoniToppings;
        this.noOfHamToppings = noOfHamToppings;
    }

    public void setSize(String s) {
        this.size = s;
    }

    public void setNoOfCheeseToppings(int nct) {
        this.noOfCheeseToppings = nct;
    }

    public void setNoOfPepperoniToppings(int npt) {
        this.noOfPepperoniToppings = npt;
    }

    public void setNoOfHamToppings(int nht) {
        this.noOfHamToppings = nht;
    }

    public String getSize() {
        return this.size;
    }

    public int getNoOfCheeseToppings() {
        return this.noOfCheeseToppings;
    }

    public int getNoOfPepperoniToppings() {
        return this.noOfPepperoniToppings;
    }

    public int getNoOfHamToppings() {
        return this.noOfHamToppings;
    }

    public double calcCost() {
        int sizeCost = 0;
        if (this.getSize().equals("Small")) {
            sizeCost = 8;
        } else if (this.getSize().equals("Medium")) {
            sizeCost = 10;
        } else if (this.getSize().equals("Large")) {
            sizeCost = 12;
        } else {
            System.out.println("Invalid size!!!");
        }

        int priceOfCheeseToppings = 2 * this.getNoOfCheeseToppings();
        int priceOfPepperoniToppings = 2 * this.getNoOfPepperoniToppings();
        int priceOfHamToppings = 2 * this.getNoOfHamToppings();
        this.cost = (double)(sizeCost + priceOfCheeseToppings + priceOfPepperoniToppings + priceOfHamToppings);
        return this.cost;
    }

    public String getDescription() {
        String var10000 = this.getSize();
        return "\n\nSize is: " + var10000 + "\t No of cheese toppings: " + this.getNoOfCheeseToppings() + "\t No of pepperoni toppings: " + this.getNoOfPepperoniToppings() + "\t No of ham toppings: " + this.getNoOfHamToppings();
    }
}


