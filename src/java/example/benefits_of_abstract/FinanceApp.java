package example.benefits_of_abstract;

public class FinanceApp {


    public static void main(String[] args) {
        FinanceApp financeApp = new FinanceApp();

        //imagine that user can iteract in console and do this
        Storage storage = financeApp.getStorage(1);
        User karel = new User("karel");

        User jarda = new User("jarda");

        storage.setDeposit(karel,2000);
        storage.setDeposit(jarda,10000);
        storage.transfer("karel","jarda",1000);
        User novak = storage.findUser("novak");


    }

    private Storage getStorage(int type){
        return switch (type)
                {
                    case 1-> new MemoryStorage();
                    case 2-> new DbStorage();
                    //case 3-> new WebServiceStorage()
                    default -> null;
                };
    }
}
