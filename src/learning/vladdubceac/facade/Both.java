package learning.vladdubceac.facade;

public class Both implements Menus {
    public Both() {
        System.out.println("Creating Both a Veg and Non-Veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in Both a Veg and Non-Veg menu");
    }
}
