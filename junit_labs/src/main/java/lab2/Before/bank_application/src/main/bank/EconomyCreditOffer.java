package lab2.Before.bank_application.src.main.bank;

public class EconomyCreditOffer extends CreditOffer {

    public EconomyCreditOffer(String id) {
        super( id );
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return customersList.add( customer );
    }

    @Override
    public boolean removeCustomer(Customer customer) {
        if ( !customer.isVip() ) {
            return customersList.remove( customer );
        }
        return false;
    }

}
