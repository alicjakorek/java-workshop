package pl.codecouple.emails;

public class GenericEmail extends Email {

    @Override
    public void sendEmail() {
        System.out.println("Generic email");
    }

    public  GenericEmail(String title, String content) {
        super (title, content);
    }
}
