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


}
