package GestorCorreo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {
    @Test
    public void check_creation_of_contact(){
        Contact contacto = new Contact("Santiago", "Borda", "santi@gmail.com");
        assertEquals("Santiago", contacto.getName());
        assertEquals("Borda", contacto.getSurname());
        assertEquals("santi@gmail.com", contacto.getMailAdress());
    }
    @Test
    public void testSetAndGetMailAdress() {
        Contact contact = new Contact("Pepe", "Gomez", "pepegomez@gmail.com");
        
        contact.setMailAdress("jorgeperez@gmail.com");
        assertEquals("jorgeperez@gmail.com", contact.getMailAdress());
    }

    @Test
    public void testSetNameAndGetName() {
        Contact contact = new Contact("Juan", "Sanchez", "jane@example.com");
        
        contact.setName("NewName");
        assertEquals("NewName", contact.getName());
    }

    @Test
    public void testSetAndGetName() {
        Contact contact = new Contact("Alice", "Johnson", "alice@example.com");
        
        contact.setSurname("NewSurname");
        assertEquals("NewSurname", contact.getSurname());
    }



}
