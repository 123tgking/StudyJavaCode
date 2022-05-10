package PrototypePattern;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log,log_new = null;

        log = new WeeklyLog();
        Attachment attachment = new Attachment();

        log.setAttachment(attachment);
        try {
            log_new = log.deepClone();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("周报是否相同： " + (log == log_new));
        System.out.println("附件是否相同： " + (log.getAttachment() == log_new.getAttachment()));
    }
}
