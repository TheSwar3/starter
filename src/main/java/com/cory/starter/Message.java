package com.cory.starter;

public class Message {

    private String content;

    public Message(String id) {
        this.content = id + " needs a girlfriend";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void deleteContent() {this.content = "";}
}
