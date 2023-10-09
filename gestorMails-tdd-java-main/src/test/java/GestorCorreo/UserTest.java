package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void create_new_user_with_name_surname_mailAdress(){
        User santiaborda = new User("Santiago", "Borda", "santiaborda");
        assertEquals("Santiago", santiaborda.getName());
        assertEquals("Borda", santiaborda.getSurname());
        assertEquals("santiaborda@femail.ctes", santiaborda.getMailAdress());
    }

    @Test
    public void create_new_user_and_check_entry_to_userlist(){
        MailManager femailcom = new MailManager();
        User santiaborda = femailcom.createNewUser("Santiago", "Borda", "santiaborda");

        assertEquals(1, femailcom.getUserList().size());
        assertEquals(santiaborda, femailcom.getUserList().get(0));
    }

    @Test
    public void create_new_user_and_give_it_a_personalized_mail_adress(){
        MailManager femailcom = new MailManager();
        User santiaborda = femailcom.createNewUser("Santiago", "Borda", "santiaborda@gmail.com");
        assertEquals("santiaborda@gmail.com", femailcom.getUserList().get(0).getMailAdress());
    }


}
