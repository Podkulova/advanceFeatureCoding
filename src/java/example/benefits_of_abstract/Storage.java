package example.benefits_of_abstract;

public abstract class Storage {
    public abstract User findUser(String name);

    public abstract void addUser(User user);

    public abstract void setDeposit(User user, int amount);

    public void transfer(String fromUser, String toUser, int value) {
        User from = findUser(fromUser);
        User to = findUser(toUser);
      setDeposit(from,from.getDeposit() - value);
        setDeposit(to,to.getDeposit() + value);
    }

    public void withDraw(String user,int amount){
        User user1 = findUser(user);
        setDeposit(user1,user1.getDeposit()-amount);
    }
}
