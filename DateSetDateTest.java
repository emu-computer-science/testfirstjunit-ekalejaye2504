/*
 * Namewr:        Emmanuel Kalejaye
 * Course:            COSC 381 
 * Project:           Date Set Date Test 
 * Due date:         03-19-25
 
 */
package testingDates;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateSetDateTest {
    
    @Test
    public void testValidDate31() {
        Date date = new Date(1, 1, 2023);
        date.setDate("July", 31, 2023);
        assertEquals(new Date(7, 31, 2023), date);
    }
    
    @Test
    public void testValidFebruary() {
        Date date = new Date(1, 1, 2023);
        date.setDate("February", 28, 2023);
        assertEquals(new Date(2, 28, 2023), date);
    }
    
    @Test
    public void testInvalidFebruary() {
        Date date = new Date(1, 1, 2023);
        Date original = new Date(1, 1, 2023);
        date.setDate("February", 29, 2023);
        assertEquals(original, date);
    }
    
    @Test
    public void testInvalid30DayMonth() {
        Date date = new Date(1, 1, 2023);
        Date original = new Date(1, 1, 2023);
        date.setDate("April", 31, 2023);
        assertEquals(original, date);
    }
    
    @Test
    public void testValid30DayMonth() {
        Date date = new Date(1, 1, 2023);
        date.setDate("April", 30, 2023);
        assertEquals(new Date(4, 30, 2023), date);
    }
}