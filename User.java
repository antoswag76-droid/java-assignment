public class User {
    private int id;
    private String name;
    private String role; // QA, Dev, Manager
    private String email;

    public User(int id, String name, String role, String email) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.email = email;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setEmail(String email) { this.email = email; }

    public void display() {
        System.out.println("User: " + name + " [" + role + "]");
    }
}
