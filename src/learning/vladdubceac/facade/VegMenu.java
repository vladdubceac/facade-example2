package learning.vladdubceac.facade;

public class VegMenu implements Menus {
    public VegMenu() {
        System.out.println("Creating a Vegetarian menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in Vegetarian menu");
    }
}
