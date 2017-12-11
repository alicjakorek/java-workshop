package pl.codecouple.emails;

public class InfoEmail extends Email{

    @Override
    public void sendEmail() {
        System.out.println("Info email");
    }

    public  InfoEmail(String title, String content) {
        super (title, content);
    }
}
