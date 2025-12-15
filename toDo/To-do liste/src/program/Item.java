package program;

public class Item {
    private String description;
    private boolean isDone;

    public void markAsDone(){
        isDone = true;
    }

    public Item(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }
}
