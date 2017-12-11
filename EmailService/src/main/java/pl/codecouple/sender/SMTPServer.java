package pl.codecouple.sender;

import pl.codecouple.emails.*;

import java.util.ArrayList;
import java.util.List;

public class SMTPServer {

    private List<Email> emails = new ArrayList<>();

    public void addEmail(Email emailToAdd) {
        emails.add(emailToAdd);
    }

    public void removeEmail(Email emailToRemove) { emails.remove(emailToRemove); }

    public void showInfoEmailDetails(InfoEmail emailToShow) {
        System.out.println(emailToShow.getTitle()+ "" +emailToShow.getContent());
         }

    public void sendEmails() {
        emails.forEach(Email::sendEmail);
//        welcomeEmails.forEach(WelcomeEmail::sendEmail);
//        confirmEmails.forEach(ConfirmEmail::sendEmail);
//        infoEmails.forEach(InfoEmail::sendEmail);

    }

}
