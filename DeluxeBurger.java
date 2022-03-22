package BillsBurgers;

public class DeluxeBurger extends BaseBurger{

    private int chipsAndDrink;

    public DeluxeBurger (String breadRollType, int basePrice) {
        super(breadRollType, basePrice);
        this.chipsAndDrink = 0;
    }

    public void addChipsAndDrinks (){
        System.out.println("Price of DeluxeBurger with " + this.getBreadRollType().toLowerCase() + " with bonus chips and drinks is " + (super.getprice() + chipsAndDrink) + " lei.");
    }
}
