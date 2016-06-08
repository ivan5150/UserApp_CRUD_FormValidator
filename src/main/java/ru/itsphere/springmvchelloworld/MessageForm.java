package ru.itsphere.springmvchelloworld;

public class MessageForm {

    private String author;
    private String text;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MessageForm{" +
                "author='" + author + '\'' +
                ", text=" + text +
                '}';
    }

}