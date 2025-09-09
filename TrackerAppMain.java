public class TrackerAppMain {
    public static void main(String[] args) {
        // Initialize users
        User dev1 = new User(1, "Alice", "Dev", "alice@example.com");
        User qa1 = new User(2, "Bob", "QA", "bob@example.com");
        Manager mgr1 = new Manager(3, "Carol", "carol@example.com");

        // Create project
        Project proj = new Project(101, "BugTracker", "https://github.com/bugtracker");

        // Add users
        proj.addUser(dev1);
        proj.addUser(qa1);
        proj.addUser(mgr1);

        // Create service
        TrackerService service = new TrackerService();

        // Create Issues
        Issue bug1 = service.createIssue(201, "Login fails", "NullPointer on login", "HIGH", "Click login without entering anything");
        Issue task1 = service.createIssue(202, "Refactor Auth", "Improve Auth module", "MEDIUM", 5);
        Issue issue3 = service.createIssue(203, "Update docs", "Missing API documentation", "LOW");

        // Add to project
        proj.addIssue(bug1);
        proj.addIssue(task1);
        proj.addIssue(issue3);

        // Assign Issues
        service.assignTo(bug1, dev1);
        service.assignTo(task1, dev1);
        service.assignTo(issue3, qa1);

        // Update Statuses
        service.changeStatus(bug1, "IN_PROGRESS");
        service.changeStatus(task1, "RESOLVED");
        service.changeStatus(issue3, "CLOSED");

        // Manager approval
        mgr1.approveIssue(task1);

        // Dashboard
        proj.displayDashboard();

        // Severity Report
        service.printSeverityReport(proj);
    }
}


