package com.greenblat.emailverification.email;

public interface EmailSender {

    void send(String to, String email);
}
