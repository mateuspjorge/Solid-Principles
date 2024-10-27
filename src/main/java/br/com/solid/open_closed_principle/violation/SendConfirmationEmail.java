package br.com.solid.open_closed_principle.violation;

import br.com.solid.single_responsibility_principle.violation.SmtpGmail;

public class SendConfirmationEmail {

    public void sendConfirmationEmail(Order order) {
        SmtpGmail smtp = new SmtpGmail("mySmtpUser", "mySmtpPassword");
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        String html = "Dear ".concat(name).concat(", yor Order ").concat(order.getId().toString()).concat(" is confirmed!");

        smtp.send(html, email);
    }

}