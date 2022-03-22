package BillsBurgers;

public class BurgerMain {

    public static void main(String[] args) {

        BaseBurger base = new BaseBurger("White roll", 8 );
        HealthyBurger healthy = new HealthyBurger("Brown rye roll", 10);
        DeluxeBurger deluxe = new DeluxeBurger("White roll", 12 );
        DeluxeBurger deluxe1 = new DeluxeBurger("Brown rye roll", 15);

        System.out.println("Price of " + base.getClass().getSimpleName() + " with " + base.getBreadRollType().toLowerCase() + " is " + base.getprice() + " lei.");
        System.out.println("Price of " + base.getClass().getSimpleName() + " with " + base.getBreadRollType().toLowerCase() + ", meat, cheese and tomato is " + (base.getprice() + base.getMeat() + base.getCheese() + base.getTomato()) + " lei.");
        System.out.println();
        System.out.println("Price of " + healthy.getClass().getSimpleName() + " is " + healthy.getprice() + " lei.");
        healthy.addOnion();
        healthy.addLettuce();
        healthy.addOnionAndLettuce();
        System.out.println();
        System.out.println("Price of " + deluxe.getClass().getSimpleName() + " with " + base.getBreadRollType().toLowerCase() + " is " + deluxe.getprice() + " lei.");
        System.out.println("Price of " + deluxe1.getClass().getSimpleName() + " with " + base.getBreadRollType().toLowerCase() + " is " + deluxe1.getprice() + " lei.");
        deluxe.addChipsAndDrinks();
        deluxe1.addChipsAndDrinks();
    }
}
