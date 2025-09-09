public class Issue {
    protected int issueId;
    protected String title;
    protected String description;
    protected String severity; // LOW, MEDIUM, HIGH
    protected String status;   // NEW, IN_PROGRESS, RESOLVED, CLOSED
    protected User assignee;

    public Issue(int issueId, String title, String description, String severity) {
        this.issueId = issueId;
        this.title = title;
        this.description = description;
        this.severity = severity;
        this.status = "NEW";
    }

    // Getters & Setters
    public int getIssueId() { return issueId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getSeverity() { return severity; }
    public String getStatus() { return status; }
    public User getAssignee() { return assignee; }

    public void setStatus(String status) { this.status = status; }
    public void setAssignee(User assignee) { this.assignee = assignee; }

    public void display() {
        System.out.println("Issue: " + title + " | Status: " + status + " | Severity: " + severity);
    }
}
