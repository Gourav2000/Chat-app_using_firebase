package com.sarkar.chuater.Model;

public class Chat {
    private String Sender;
    private String Receiver;
    private String Message;
    private boolean isseen;

    public Chat(String sender, String receiver, String message,boolean isseen) {
        this.Sender = sender;
        this.Receiver = receiver;
        this.Message = message;
        this.isseen=isseen;

    }

    public Chat() {

    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }
}
