public class TrackerService {

    public Issue createIssue(int id, String title, String desc, String severity) {
        return new Issue(id, title, desc, severity);
    }

    // Overloaded createIssue
    public Issue createIssue(int id, String title, String desc, String severity, String stepsToReproduce) {
        return new Bug(id, title, desc, severity, stepsToReproduce);
    }

    public Issue createIssue(int id, String title, String desc, String severity, int eta) {
        return new Task(id, title, desc, severity, eta);
    }

    public void assignTo(Issue issue, User user) {
        issue.setAssignee(user);
        System.out.println("Assigned " + issue.getTitle() + " to " + user.getName());
    }

    public void changeStatus(Issue issue, String newStatus) {
        issue.setStatus(newStatus);
        System.out.println("Issue " + issue.getTitle() + " moved to " + newStatus);
    }

    public void printSeverityReport(Project project) {
        System.out.println("\n--- Severity Report ---");
        project.listBySeverity("HIGH");
        project.listBySeverity("MEDIUM");
        project.listBySeverity("LOW");
    }
}
