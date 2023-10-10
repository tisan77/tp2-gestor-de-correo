package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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

    @Test
    public void testSetAndGetMailAdress() {
        User user = new User("Santi", "Borda", "santi@example.com");
        
        user.setMailAdress("newemail@example.com");
        assertEquals("newemail@example.com", user.getMailAdress());
    }

    @Test
    public void testSetAndGetSurname() {
        User user = new User("Santi", "Borda", "santi@example.com");
        
        user.setSurname("NewSurname");
        assertEquals("NewSurname", user.getSurname());
    }

    @Test
    public void testSetAndGetName() {
        User user = new User("Santi", "Borda", "santi@example.com");
        
        user.setName("NewName");
        assertEquals("NewName", user.getName());
    }

    @Test
    public void testGetContactList() {
        User user = new User("Santi", "Borda", "santi@example.com");
        Contact contact1 = user.addNewContact("Amigo1", "Apellido1", "friend1@example.com");
        Contact contact2 = user.addNewContact("Amigo2", "Apellido2", "friend2@example.com");

        ArrayList<Contact> contactList = user.getContactList();

        assertEquals(2, contactList.size());
        assertTrue(contactList.contains(contact1));
        assertTrue(contactList.contains(contact2));
    }

    @Test
    public void testGetEmail() {
        User user = new User("Pepe", "Gomez", "pepe@example.com");
        assertEquals("pepe@example.com", user.getEmail());
    }
    @Test
    public void asd() {
        User user = new User("Pepe", "Gomez", "pepe@example.com");
        assertEquals("pepe@example.com", user.getEmail());
    }
}
