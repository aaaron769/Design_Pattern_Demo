package FactoryPattern_Demo;
// if the user string is saying Domestic plan then the factoryPlan will crate the instance of this class

class  DomesticPlan extends Plan{
    //@override
    public void getRate(){
        rate=3.50;
    }
}//end of DomesticPlan class.
