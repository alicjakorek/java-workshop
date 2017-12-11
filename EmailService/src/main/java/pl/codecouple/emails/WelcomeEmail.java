package pl.codecouple.emails;

public class WelcomeEmail extends Email {

    @Override
    public void sendEmail() {
        System.out.println("Welcome email");
    }

    public  WelcomeEmail(String title, String content) {
        super (title, content);
    }
}
