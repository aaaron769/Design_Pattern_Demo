package FactoryPattern_Demo;
// if the user string is saying commercial plan then the factoryPlan will crate the instance of this class
class  CommercialPlan extends Plan {

    //@override
    public void getRate() {
        rate = 7.50;
    }
}
//end of CommercialPlan class.
