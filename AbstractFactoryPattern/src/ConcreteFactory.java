public class ConcreteFactory implements IBank {
    @Override
    public AbstractProductLoan getLoan() {
        return new ProductLoan();

    }

    @Override
    public AbstractProductBank getBank() {
        return new ProductBank();
    }
}
