package learning.vladdubceac.facade;

public class VegNonBothRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        Both both = new Both();
        return both;
    }
}
