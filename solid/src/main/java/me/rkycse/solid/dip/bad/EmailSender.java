package me.rkycse.solid.dip.bad;

public class EmailSender {
    public void send(String message) {
        System.out.println("Sending email with bad DIP: " + message);
    }
}