public class Main {

    public static void main(String args[]){
        ConcreteFactory concreteFactory = new ConcreteFactory();
        AbstractProductBank abstractProductBank = concreteFactory.getBank();
        AbstractProductLoan abstractProductLoan = concreteFactory.getLoan();
        // main method interacts only with the concrete Factory at which it has a method which retruns the abstractProduct.
        // where the product extends the Abstract product
        // we have access the properties of Abstract product-- this is the difference with the Factory method
        String abstractProductBankInfo = abstractProductBank.getInfo();
        String abstractProductLoanInfo =abstractProductLoan.getInfo();
        System.out.println(abstractProductBankInfo);
        System.out.println(abstractProductLoanInfo);

    }
}
