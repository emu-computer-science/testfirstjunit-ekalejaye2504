/*
 * Name:        Emmanuel Kalejaye
 * Course:            COSC 381 
 * Project:           Date Add Days Test Suite
 * Due date:         03-19-25
 

 */
package testingDates;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateAddDaysTest {
    
    @Test
    public void testStayInSameMonth() {
        Date date = new Date(6, 15, 2023);
        date.addOneDay();
        assertEquals(new Date(6, 16, 2023), date);
    }
    
    @Test
    public void testStayInSameMonthDifferentMonth() {
        Date date = new Date(10, 20, 2023);
        Date result = date.addOneDay();
        assertEquals(new Date(10, 21, 2023), result);
    }
    
    @Test
    public void testCrossMonthBoundary30() {
        Date date = new Date(4, 30, 2023);
        date.addOneDay();
        assertEquals(new Date(5, 1, 2023), date);
    }
    
    @Test
    public void testCrossMonthBoundary31() {
        Date date = new Date(7, 31, 2023);
        date.addOneDay();
        assertEquals(new Date(8, 1, 2023), date);
    }
    
    @Test
    public void testCrossYearBoundary() {
        Date date = new Date(12, 31, 2023);
        date.addOneDay();
        assertEquals(new Date(1, 1, 2024), date);
    }
    
    @Test
    public void testFebruaryBoundary() {
        Date date = new Date(2, 28, 2023);
        date.addOneDay();
        assertEquals(new Date(3, 1, 2023), date);
    }
}