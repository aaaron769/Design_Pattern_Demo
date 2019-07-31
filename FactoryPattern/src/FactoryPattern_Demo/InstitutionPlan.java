package FactoryPattern_Demo;
// if the user string is saying Institutional plan then the factoryPlan will crate the instance of this class

class  InstitutionalPlan extends Plan {
    //@override
    public void getRate() {
        rate = 5.50;
    }
}
//end of InstitutionalPlan class.
