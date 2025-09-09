public class Task extends Issue {
    private int estimatedHours;

    public Task(int issueId, String title, String description, String severity, int estimatedHours) {
        super(issueId, title, description, severity);
        this.estimatedHours = estimatedHours;
    }

    @Override
    public void display() {
        System.out.println("Task: " + title + " | ETA: " + estimatedHours + "h");
    }
}
