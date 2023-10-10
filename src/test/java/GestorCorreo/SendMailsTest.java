package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class SendMailsTest {
@Test
    public void create_app_create_user_send_mail(){
    MailManager aplicacion = new MailManager();
    User santi = aplicacion.createNewUser("Santiago", "Borda", "santib");
    User felix = aplicacion.createNewUser("Felix", "Toledo", "felixt");
    User pedro = aplicacion.createNewUser("Pedro", "Rosales", "pedro@gmail.com");
    ArrayList<String> para = new ArrayList<>();
    para.add("felixt@femail.ctes");
    para.add("pedro@gmail.com");

    santi.createMessage(aplicacion, "Saludos de tu amigo", "Hola amigo, cómo andas?", para);
    assertEquals(1, santi.getOutbox().size());
    assertEquals(1, felix.getInbox().size());
    assertEquals(1, pedro.getInbox().size());
}

}
