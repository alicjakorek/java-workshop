package pl.codecouple.emails;

public class Email {
    private String title;
    private String content;

    public Email(String title, String content) {
        this.title = title;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    public void sendEmail() {
        System.out.println("Email");
    }
}
