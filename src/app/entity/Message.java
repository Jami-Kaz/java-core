package app.entity;

import java.util.Date;

public class Message {
    private User from;
    private User to;
    private Date date;
    private String content;

    public Message(User to, String content){
        this.to = to;
        this.content = content;
    }


    public void send(User from){

    }
}
