package GestorCorreo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class BoxTest {
    @Test
    public void testAddAndGet() {
        Box box = new Box();
        ArrayList<String> para = new ArrayList<>();
        para.add("hola2@gmail.com");
        Mail mail1 = new Mail("Correo 1", "Mensaje1", "hola@gmail.com", para);
        Mail mail2 = new Mail("Correo 2", "Mensaje2", "hola@gmail.com", para);

        box.add(mail1);
        box.add(mail2);

        assertEquals(2, box.size());
        assertEquals(mail1, box.get(0));
        assertEquals(mail2, box.get(1));
    }

    @Test
    public void testGetAll() {
        Box box = new Box();
        ArrayList<String> para = new ArrayList<>();
        para.add("hola2@gmail.com");
        Mail mail1 = new Mail("Correo 1", "Mensaje1", "hola@gmail.com", para);
        Mail mail2 = new Mail("Correo 2", "Mensaje2", "hola@gmail.com", para);

        box.add(mail1);
        box.add(mail2);

        ArrayList<Mail> allMails = box.getAll();

        assertEquals(2, allMails.size());
        assertTrue(allMails.contains(mail1));
        assertTrue(allMails.contains(mail2));
    }

    @Test
    public void testSizeEmptyBox() {
        Box box = new Box();
        assertEquals(0, box.size());
    }
}

