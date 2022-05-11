package modle;

public class Adress {
    private String firstName;
    private String lastName;
    private String adressName;

    public Adress(String adressName) {
        this.setAdressName(adressName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdressName() {
        return this.adressName;
    }

    public void setAdressName(String adressName) {
        this.adressName = adressName;
    }

}
