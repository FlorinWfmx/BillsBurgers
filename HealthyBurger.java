public class HealthyBurger extends BaseBurger{

    private int lettuce;
    private int onion;

    public HealthyBurger (String breadRollType, int price){
        super(breadRollType, price);
        this.lettuce = 2;
        this.onion = 3;
    }

    public void addLettuce() {
        System.out.println("Price of HealthyBurger with lettuce is " + (super.getprice() + lettuce) + " lei.");
    }

    public void addOnion() {
        System.out.println("Price of HealthyBurger with onion is " + (super.getprice() + onion) + " lei.");
    }

    public void addOnionAndLettuce() {
        System.out.println("Price of HealthyBurger with onion and lettuce is " + (super.getprice() + onion + lettuce) + " lei.");
    }
}
