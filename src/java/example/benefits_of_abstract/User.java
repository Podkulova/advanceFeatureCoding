package example.benefits_of_abstract;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "_User")
@NoArgsConstructor
public class User {
    @Id
    private String name;
    private int deposit;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
}
