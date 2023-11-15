package university.lesson2.points;

public class Comment implements Attribute{
    private String comment;

    public Comment(String comment) {
        if(comment.isEmpty()) throw new IllegalArgumentException();
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String attributeToString() {
        return "с пометкой: \"" + comment + "\"";
    }

    public String toString(){
        return comment;
    }

}
