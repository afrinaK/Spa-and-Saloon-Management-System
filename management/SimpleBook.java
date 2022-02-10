/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon.and.spa.management;

/**
 *
 * @author HP
 */
public class SimpleBook {
   private String name;
   private String date;
   private String month;
  
  private String time;
 
  private String phone;
  private String email;
  private  String ID;
  
  
   public SimpleBook(String n,String d,String m, String t,String p,String e,String i){
      name=n.trim();
      date=d;
      month=m.trim();
     
      time=t.trim();
      
      phone=p.trim();
      email=e.trim();
      ID=i.trim();
     
     
   }

    
    
   
   public String getName(){
       return name;
   }
   public String getDate(){
       return date;
   }
   public String getMonth(){
       return month;
   }
   
   public String getTime(){
       return time;

   }
   public String getPhone(){
       return phone;
       
   }
   
   public String getEmail(){
       return email;
   }
    public String getID(){
       return ID;
   }
    
   
   
   
}