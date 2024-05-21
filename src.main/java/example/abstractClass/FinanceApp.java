package example.abstractClass;

public class FinanceApp {
    public static void main(String[] args) {
        FinanceApp financeApp = new FinanceApp();

        Storage storage = new FinanceApp().getStorage(1);

        User karel = new User("Karel");
        User jarda = new User("Jarda");

        storage.setDeposit(karel, 2000);
        storage.setDeposit(jarda, 10000);

        storage.transfer("Karel", "Jarda", 1000);

        User novak = storage.findUser("Novak");
    }

    private Storage getStorage(int type) {
        return switch (type) {
           /* case 1 -> new MemoryStorage();*/
     /*       case 2 -> new DbStorage();
            case 3 -> new WebServiceStorage();*/
            default -> null;
        };
    }
}
