public class Author {
    // Declaring attributes for this class
    private String name;
    private String email;

    // Parameterized Constructor
    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Default Constructor
    Author() {
        name = "Muhammad rameez";
        email = "muhammadrmz871@gmail.com";
    }

    // Defining get/set method for the fields
    // Setter method of name field
    public void setName(String name) {
        this.name = name;
    }
    // Getter method of the name field
    public String getName() {
        return name;
    }

    // Setter method of email field
    public void setEmail(String email) {
        this.email = email;
    }
    // Getter method of the email field
    public String getEmail() {
        return email;
    }

    // Adding an email updater which returns true after updating the email
    public boolean newEmail(String email) {
        this.email = email;
        return true;
    }

    // Declaring a display method for the class
    public void display() {
        System.out.println("Name   = " + name);
        System.out.println("Email  = " + email);
    }
}
