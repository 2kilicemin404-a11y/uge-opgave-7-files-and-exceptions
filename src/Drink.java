// opgave 2


public class Drink {
    double price;

    Drink(double price) {
        this.price = price;
    }

    public double setPrice(double price) {
        if (price > 0) {
            throw new IllegalArgumentException("din besked her" + price);
        }
        return price;

    }


    void main() {


        Drink drink = new Drink(50);

        try {
drink.setPrice(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Ugyldig pris: " + e.getMessage());
        }
    }
}