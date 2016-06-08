package ru.itsphere.springmvchelloworld;

public class Message {

    private String author;
    private String text;
    private int id;

    public Message(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
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
        return author + ' ' + text;
    }

}