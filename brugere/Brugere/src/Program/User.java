package Program;

public class User {
    private String name;
    private String password;
    private String email;
    private int phoneNumber = -1;

    public User(String name, String password) {
        this.name = nameValidator(name);
        this.password = password;
    }

    public User(String name, String password, String email) {
        this.name = nameValidator(name);
        this.password = password;
        this.email = emailValidator(email);
    }

    public User(String name, String password, String email, int phoneNumber) {
        this.name = nameValidator(name);
        this.password = password;
        this.email = emailValidator(email);
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        if (email == null){
            return "User: Name, "+name+" Password, "+password;
        }
        else if(phoneNumber == -1){
            return "User: Name, " +name+" Password, "+password+" email, "+email;
        }
        else {
            return "User: Name, " + name + " Password, " + password + " email, " + email + " Phone number, " + phoneNumber;


        }
    }

    private String nameValidator(String s) {


        if (!Character.isUpperCase(s.charAt(0))) {
            return "Ugyldigt";
        }

        if (s.length() > 12) {
            return "Ugyldigt";
        }

        return s;
    }
    private String emailValidator(String s) {


        if (!s.contains("@")) {
            return "Ugyldigt";
        }


        return s;
    }




}
