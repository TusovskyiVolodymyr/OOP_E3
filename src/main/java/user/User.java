package user;

import model.Warrior;

import java.util.Objects;

public class User {
    private String userName;
    private Warrior droidType;
    private boolean isTurn;

    public User(String userName, Warrior droidType) {
        this.userName = userName;
        this.droidType = droidType;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean turn) {
        isTurn = turn;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Warrior getDroidType() {
        return droidType;
    }

    public void setDroidType(Warrior droidType) {
        this.droidType = droidType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userName.equals(user.userName) &&
                droidType.equals(user.droidType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, droidType);
    }

    @Override
    public String toString() {
        return "user.User{" +
                "userName='" + userName + '\'' +
                ", droidType='" + droidType + '\'' +
                '}';
    }
}
