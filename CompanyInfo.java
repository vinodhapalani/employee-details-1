package org.company;
//based on datatype count
public class CompanyInfo {
         public void companyName( String name) 
         {
         System.out.println("companyName:"+name);
         }
         
         public void companyName(int age, String Country)
         {
        	 System.out.println("companyName:"+age);
        	 System.out.println("companyName:"+Country);
        	  
         }
         public void companyName(float Salary,long pfno)
         {
           System.out.println("companyName:"+Salary );
           System.out.println("companyName:"+pfno);
           
         }
         public  static void main(String[] args)
         {
        	 CompanyInfo c=new CompanyInfo();
        	 c.companyName("jeeva");
        	 c.companyName(33, "India");
        	 c.companyName(500000f, 1500000l);
         }
         }
