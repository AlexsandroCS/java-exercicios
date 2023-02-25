package entity;

public class Clientes{
    private String nameGuest;
    private String emailGuest;
    private int roomGuest;

    public Clientes(String name, String email, int number){
        this.nameGuest = name;
        this.emailGuest = email;
        this.roomGuest = number;
    }

    public String getRoomGuest() {
        return nameGuest;
    }

    public String getEmailGuest() {
        return emailGuest;
    }

    public int getNumberGuest() {
        return roomGuest;
    }
}
