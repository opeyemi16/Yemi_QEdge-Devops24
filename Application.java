	
package com.softwaretestinghelp;
 
public class DemoClass{
 
          public static String getGrade(int percentage ) {       
               if(percentage&amp;gt;=60){  
                   System.out.println("A grade"); 
                   return "A grade"; //Return statement
               }else if(percentage&amp;gt;=40){  
                   System.out.println("B grade"); 
                   return "B grade"; //Return statement
               }else {  
                   System.out.println("Not Eligible");  
                   return "Not Eligible"; //Return statement
               }
          }
 #feature202 changes on reports module by Leye in oct2023
  public class CompareTo {
 

    public static void main(String[] args) {
         
        String str1 = "Software Testing";
        String str2 = "Software Testing Help";
         
        System.out.println(str1.compareTo(str2));
        // Since str2 contains 5 characters more than the str1, output should be -5
         
        System.out.println(str2.compareTo(str1));
        // Since str2 contains 5 characters less than the str1, output should be +5
    }
}
#end of feature202 changes
  
  #feature201 changes by Developer Yemi for the module paymentgateway oct2023
 public class Contains {
    public static void main(String[] args) {
        String str1 = "The Topic is: Java String contains";
        String str2 = "Java";
        if(str1.contains(str2)) {
            System.out.println("Returns True");
        }
        else {
            System.out.println("Returns False");
        }
         
         
    }
}end of feature201 code
 
 public static void main (String[] args){
    System.out.println("Hello , this is sample program");   
    String grade = DemoClass.getGrade(70);
    System.out.println("Grade:"+grade);
 }
 
}