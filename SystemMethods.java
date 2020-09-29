
package managemnetSystem;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
public class SystemMethods {
    
    
    public boolean login(String username, String password){
        String u = username;
        String p = password;
        if(u.equals("Admin") && p.equals("Admin")){
            return true;
        }
        else{
        return false;
        }
    }
   
    public ArrayList<String> testAddStudentName() {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Farhan");

    return(arr);
    }
     public ArrayList<String> testAddStudentemail() {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("xyz@gamil.com");

    return(arr);
    }
      public ArrayList<String> testAddStudentRoll() {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("18101480");

    return(arr);
    }
      public ArrayList<String> testAddStudentAddress() {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Mirpur Dhaka");

    return(arr);
    } 
    
    
    public ArrayList<String> RemoveStudent(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.clear();
    return arr;   
    }
    
    
    public String UpdateStudentList(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Faisal");
    
    arr.add("2");
    arr.add("Karim");
    arr.add("3");
    arr.set(4, "Aryan");
    return arr.get(4);
    }
    
    public boolean SearchStudent(){
    ArrayList<String> arr = new ArrayList<String>();
    if(!arr.contains("Aryan")){
      return true;   
    }
    return false;
    }
    

    
    
    public String ViewStudentDetails(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Farhan");
    arr.add("20");
    arr.add("2");
    arr.add("Aryan");
    arr.add("22");
    if(!arr.isEmpty()){
       return "You can now view the details"; 
    }
    return "Do not exist";
    }
   
       
 
    public String StudentTotalFeeCounter(int s){
          if(s <5000){
             return "Approved";
          }
          else{
             return "Declined";
              }
     }
    public String ViewStudentAnnouncements(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("15 august school off");
    arr.add("2");
   
    arr.add("ct start from 15 sept");
    arr.add("22");
    if(!arr.isEmpty()){
       return "Final starts from 5th october 2020"; 
    }
    return "no events";
    }
    
    public int StudentReportCard(int a,int b,int c,int d,int e){
        
        int english = a;
        int physics = b;
        int chemistry = c;
        int math = d;
        int biology = e;
        
        

        int totalmark=chemistry+physics+math+biology+english;
        int percentage=(totalmark/5);
        return percentage;
        
    
    }
    public String StudentService(){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("1");
    arr.add("Mr samiul islam");
    arr.add("2");
   
    arr.add("Tanvir rahman");
    arr.add("22");
    if(!arr.isEmpty()){
       return "mail your faculty for appoinments"; 
    }
    return "no faculty is available ";
    }
    
  
    
    
}
