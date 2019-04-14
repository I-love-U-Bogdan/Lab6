public enum DegreeOfHit {
    VERYSTRONG("разрушительно"),
    STRONG("сильно"),
    NORMAL("достойно"),
    WEAK("ели заметно");

    public String title;

    DegreeOfHit(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }
}
