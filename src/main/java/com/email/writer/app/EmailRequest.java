package com.email.writer.app;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;

    public CharSequence getTone() {
    }

    public char[] getEmailContent() {
        return null;
    }
}
