package pl.codecouple.emails;

import java.time.LocalDateTime;

public class ConfirmEmail extends Email{

    private String password;

    @Override
    public void sendEmail() {
        System.out.println("Confirm email");
        System.out.println("Confirm email password: " + createPasswordHash());
    }

    private String createPasswordHash() {
        return password + "_" + LocalDateTime.now();
    }

    public ConfirmEmail(String title, String content, String password) {
        super(title, content);
        this.password = password;
    }
}
