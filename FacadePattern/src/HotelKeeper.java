/**
 * This is the Facade principle
 * which hides the implementation
 * of the subsystem but provide the instance of them
 * helps us for helping complex project easily to get instance of subsystems.
 * and to use subsystem easy to use.
 */
public class HotelKeeper {
    /**
     * @return the vegMenu instance
     */
    public VegMenu getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }

    /**
     * @return the getNonVegMenu instance
     */
    public NonVegMenu getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }

    /**
     * @return the both instance
     */
    public Both getVegNonMenu()
    {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Both bothMenu = (Both)v.getMenus();
        return bothMenu;
    }
}
