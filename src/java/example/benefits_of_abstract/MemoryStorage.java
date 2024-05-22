package example.benefits_of_abstract;

import java.util.ArrayList;
import java.util.List;

public class MemoryStorage extends Storage {

    List<User> users = new ArrayList<>();

    @Override
    public User findUser(String name) {
        return users.stream().filter(u -> u.getName().equals(name)).findAny().get();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void setDeposit(User user, int amount) {
        findUser(user.getName()).setDeposit(amount);
    }
}
