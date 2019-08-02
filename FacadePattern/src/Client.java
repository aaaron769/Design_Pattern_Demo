public class Client
{
    public static void main (String[] args)
    {
        // asking hotelKeeper
        HotelKeeper keeper = new HotelKeeper();
        //asking hotelKeeper to give you vegMenu
        VegMenu v = keeper.getVegMenu();
        // asking hotelKeeper to give you nonVegMenu
        NonVegMenu nv = keeper.getNonVegMenu();
        // asking user to give you both none and vegMenu
        Both both = keeper.getVegNonMenu();

    }
}
