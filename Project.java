import java.util.*;

public class Project {
    private int projectId;
    private String name;
    private String repoUrl;
    private List<Issue> backlog;
    private List<User> team;

    public Project(int projectId, String name, String repoUrl) {
        this.projectId = projectId;
        this.name = name;
        this.repoUrl = repoUrl;
        this.backlog = new ArrayList<>();
        this.team = new ArrayList<>();
    }

    public void addIssue(Issue issue) {
        backlog.add(issue);
    }

    public void addUser(User user) {
        team.add(user);
    }

    public List<Issue> getBacklog() {
        return backlog;
    }

    public void displayDashboard() {
        System.out.println("\n--- Project: " + name + " ---");
        for (Issue i : backlog) {
            i.display();
        }
    }

    public void listBySeverity(String severity) {
        System.out.println("\nIssues with severity: " + severity);
        for (Issue i : backlog) {
            if (i.getSeverity().equalsIgnoreCase(severity)) {
                i.display();
            }
        }
    }
}
