package az.code.tensapi.service;

public interface EmailService {
    void sendConfirmationEmail(String to, String confirmationToken);
    void sentMailMessage(String to, String notification);
}
