public class Bug extends Issue {
    private String stepsToReproduce;

    public Bug(int issueId, String title, String description, String severity, String stepsToReproduce) {
        super(issueId, title, description, severity);
        this.stepsToReproduce = stepsToReproduce;
    }

    @Override
    public void display() {
        System.out.println("Bug: " + title + " | Steps: " + stepsToReproduce);
    }
}
