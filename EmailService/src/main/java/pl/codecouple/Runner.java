package pl.codecouple;

import pl.codecouple.emails.ConfirmEmail;
import pl.codecouple.emails.GenericEmail;
import pl.codecouple.emails.InfoEmail;
import pl.codecouple.emails.WelcomeEmail;
import pl.codecouple.sender.SMTPServer;

class Runner {

    public static void main(String[] args) {
        ConfirmEmail confirmEmail = new ConfirmEmail("Title", "Content", "Password");
        WelcomeEmail welcomeEmail = new WelcomeEmail("Title", "Content");
        GenericEmail genericEmail = new GenericEmail("Title", "Content");

        SMTPServer server = new SMTPServer();

        server.addEmail(confirmEmail);
        server.addEmail(welcomeEmail);
        server.addEmail(genericEmail);

        server.sendEmails();

        InfoEmail infoEmail = new InfoEmail("title", "content");
        server.showInfoEmailDetails(infoEmail);
    }

}
