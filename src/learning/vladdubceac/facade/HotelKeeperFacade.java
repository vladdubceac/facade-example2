package learning.vladdubceac.facade;

public class HotelKeeperFacade{

    public HotelKeeperFacade() {
    }

    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu)vegRestaurant.getMenus();
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }

    public Both getVegNonBothMenu() {
        VegNonBothRestaurant bothRestaurant = new VegNonBothRestaurant();
        return (Both)bothRestaurant.getMenus();
    }
}
