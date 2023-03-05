package learning.vladdubceac.facade;

public class Client {

    public static void main(String[] args) {
        HotelKeeperFacade keeper = new HotelKeeperFacade();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both b = keeper.getVegNonBothMenu();

        v.showMenu();
        nv.showMenu();
        b.showMenu();
    }
}
