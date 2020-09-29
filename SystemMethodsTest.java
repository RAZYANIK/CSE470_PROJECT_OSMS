/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managemnetSystem;

import managemnetSystem.SystemMethods;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class SystemMethodsTest {
    
    SystemMethods m;
   
    
    @Before
    public void setUp() throws Exception {
        m = new SystemMethods();
    }
      
    
    @Test
    public void testLogin(){
        String u = "Admin";
        String p = "Admin";
        
        boolean b = m.login(u, p);
        assertTrue(b);
        
    }
    
    @Test
    public void testAddStudentName() {
      assertEquals(Arrays.asList("1", "Farhan"), m.testAddStudentName());
    }

    public void testAddStudentRoll() {
      assertEquals(Arrays.asList("1", "18101480"), m.testAddStudentRoll());
    }
    public void testAddStudentAddress() {
      assertEquals(Arrays.asList("1", "Mirpur Dhaka"), m.testAddStudentAddress());
    }
   
    @Test
    public void testRemoveStudent(){
     assertEquals(Arrays.asList(), m.RemoveStudent());
    }
    
    @Test
    public void testUpdateStudentList(){
        
      assertEquals("Aryan",m.UpdateStudentList());    
    
    }
   
    @Test
    public void testSearchStudent(){
     
       assertEquals(Arrays.asList("1","farhan", "20","2","karim","22","3","Aryan","24").contains("Aryan"), m.SearchStudent());
        
    }
    
    @Test
    public void testViewStudentDetails(){   
        assertEquals("You can now view the details",m.ViewStudentDetails());   
    }
     
    

   
    @Test
    public void testStudentTotalFeeCounter() {
        
       assertEquals("Approved",m.StudentTotalFeeCounter(500));
    }
    @Test
    public void testViewStudentAnnouncements(){   
        assertEquals("Final starts from 5th october 2020",m.ViewStudentAnnouncements());   
    }
   
    
    @Test
    public void testStudentReportCard(){
        
        assertEquals(83,m.StudentReportCard(95,85,75,86,78));  
    
   }
    
    @Test
    public void testStudentService(){
   
     assertEquals("mail your faculty for appoinments",m.StudentService());
      
    }
    
    }
    
    
   

    
    
   
    
   
    
    
    

