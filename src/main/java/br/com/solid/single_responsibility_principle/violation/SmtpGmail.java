package br.com.solid.single_responsibility_principle.violation;

public class SmtpGmail {

    public SmtpGmail(String user, String password) {
        System.out.println("Performing SMTP configuration and connection with user ".concat(user)
                                                                                    .concat(" and ")
                                                                                    .concat("pass ")
                                                                                    .concat(password));
    }

    public void send(String html, String mail) {
        System.out.println("Sending confirmation email: ".concat(html));
    }

}