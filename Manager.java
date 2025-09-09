public class Manager extends User {

    public Manager(int id, String name, String email) {
        super(id, name, "Manager", email);
    }

    public void approveIssue(Issue issue) {
        System.out.println("Manager " + getName() + " approved Issue: " + issue.getTitle());
    }

    @Override
    public void display() {
        System.out.println("Manager: " + getName() + " | Email: " + getEmail());
    }
}
