public class BaseBurger {

    private String breadRollType;
    private int price;
    private boolean hasMeat;
    private int meat;
    private int tomato;
    private int cheese;


    public BaseBurger(String breadRollType, int price) {
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = 5;
        this.tomato = 3;
        this.cheese = 4;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCheese() {
        return cheese;
    }

    public int getprice() {
        return price;
    }

    public boolean HasMeat() {
        return hasMeat;
    }
}
