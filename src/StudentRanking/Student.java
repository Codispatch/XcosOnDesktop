/**
 * Name : Shravan C
 * College : Manipal Institute of Technology
 * Date Uploaded : 3-4-2016 
 * < ------------SAMPLE INPUT ------------------>
Enter the Number of Students : 5
Enter the Details for 5 Students : 

-->> Enter Details for Student Number :: 1
Enter the Roll Number : 130905414
Enter the Name : shravan
Enter the Language 1 Marks : 100
Enter the Language 2 Marks : 100
Enter the Math Marks : 90
Enter the Science Marks : 90
Enter the Evs Marks : 90
* 
-->> Enter Details for Student Number :: 2
Enter the Roll Number : 130905404
Enter the Name : megha
Enter the Language 1 Marks : 100
Enter the Language 2 Marks : 100
Enter the Math Marks : 90
Enter the Science Marks : 90
Enter the Evs Marks : 90
* 
-->> Enter Details for Student Number :: 3
Enter the Roll Number : 130905402
Enter the Name : shreya
Enter the Language 1 Marks : 99
Enter the Language 2 Marks : 98
Enter the Math Marks : 99
Enter the Science Marks : 96
Enter the Evs Marks : 99
* 
-->> Enter Details for Student Number :: 4
Enter the Roll Number : 130905403
Enter the Name : rohit
Enter the Language 1 Marks : 94
Enter the Language 2 Marks : 96
Enter the Math Marks : 100
Enter the Science Marks : 100
Enter the Evs Marks : 94
* 
-->> Enter Details for Student Number :: 5
Enter the Roll Number : 130905406
Enter the Name : nikhil
Enter the Language 1 Marks : 99
Enter the Language 2 Marks : 99
Enter the Math Marks : 98
Enter the Science Marks : 97
Enter the Evs Marks : 100
* 
* <--- SAMPLE OUTPUT --- >
Rank 		 Rollno 		 Name 		 Lang1 		 Lang2 		 Math 		 Science 		 Evs 		 TotalMarks  

1		130905406		nikhil		99.0		99.0		98.0		97.0			100.0		493.0
2		130905402		shreya		99.0		98.0		99.0		96.0			99.0		491.0
3		130905403		rohit		94.0		96.0		100.0		100.0			94.0		484.0
4		130905404		megha		100.0		100.0		90.0		90.0			90.0		470.0
5		130905414		shravan		100.0		100.0		90.0		90.0			90.0		470.0			   90.0		 470.0
* < -- Other Details -->
* Sources for ref: Java Complete Reference 9th Edtition ,www.JavaTpoint.com,Stack Overflow 
* Last Changes made : Duplicate Inputs are handled Safely using HashSet .
*                     Invalid Inputs are handled Safely using Exception Handling.
*/
package StudentRanking;
import java.util.*;
import java.io.*;
import java.util.regex.*;  

public class Student  {
    
    private int Rollno;
    public static int Rank;
    private double TotalMarks=0;
    private String Name;
    private double Lang1;
    private double Lang2;
    private double Math;
    private double Science;
    private double Evs;
    
    // Things required to check for duplicate Roll_number
    static HashSet<Integer> d=new HashSet<Integer>();     
    
    // Getters/Setters to get and Set the Private variables of this Class
    public double getRollno()
    {
        return this.Rollno;
    }
    public double getTotalMarks()
    {
        return this.TotalMarks;
    }
    public String getName()
    {
        return this.Name;
    }
    public double getLang1()
    {
        return this.Lang1;
    }
    public double getLang2()
    {
        return this.Lang2;
    }
    public double getMath()
    {
        return this.Math;
    }
    public double getScience()
    {
        return this.Science;
    }
    public double getEvs()
    {
        return this.Evs;
    }
     public void getMarks(int Rank)
    {
     System.out.println(Rank+"\t\t"+this.Rollno+"\t\t"+this.Name+"\t\t"+this.Lang1+"\t\t"+this.Lang2+"\t\t"+this.Math+"\t\t"+this.Science+"\t\t\t"+this.Evs+"\t\t"+this.TotalMarks);
    }
     // Use HashSet to check Duplicate Roll Numbers
     public static boolean setRollno(int temp)
     {       
           if(!d.contains(temp))
             {
                 d.add(temp); return true;
             }
             else 
                 return false;
     }
    public double calcTotalMarks()
    {
        return (this.Lang1 + this.Lang2 + this.Math + this.Science + this.Evs );
    }
    public void setMarks() throws DuplicateRollnoException,InvalidNameException,InvalidMarksException
    {
       /* The Main idea behind Set Marks is - ** Never Allow user to Enter Invalid Input ** -
          which is Solved using HashSet Duplicate Handler , Custom and Default Exception Handling Mechanism
       */    
        int rollno; String name; double marks;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Roll Number : \n");
        rollno = in.nextInt();
        if(setRollno(rollno))
            this.Rollno=rollno;
        else
            throw new DuplicateRollnoException("Duplicate Roll Number cannot be entered,");

        // Get the Student Details
        // http://www.javatpoint.com/java-regex 
        System.out.println("Enter the Name : \n");
        if(Pattern.matches("[a-z A-Z]*",name=in.next()))
         this.Name = name;
        else if(this.TotalMarks == 0)
        {    
            d.remove(rollno); 
            throw new InvalidNameException("Must be Characters Only !");
        }
        in.nextLine();
        // Get the Student Marks and Never allow User To Enter Wrong or Invalid Input
        System.out.println("Enter the Language 1 Marks : \n");
        marks=in.nextDouble();
        if(marks < 0 || marks > 100)
        {
           if(this.TotalMarks == 0)
           {  d.remove(rollno);   // Remove rollno from HashSet and Start Again
            throw new InvalidMarksException("Marks should not be Negative or Greater than Max Marks,");
           }
        }
        else 
        this.Lang1 = marks;
        
        System.out.println("Enter the Language 2 Marks : \n");
         marks=in.nextDouble(); 
        if(marks < 0 || marks > 100)
        {
             if(this.TotalMarks == 0)
           {  d.remove(rollno);   // Remove rollno from HashSet and Start Again
            throw new InvalidMarksException("Marks should not be Negative or Greater than Max Marks,");
           }
        }
        else 
        this.Lang2 = marks;
        
        System.out.println("Enter the Math Marks : \n");
         marks=in.nextDouble();
        if(marks < 0 || marks > 100)
        {
            if(this.TotalMarks == 0)
           {  d.remove(rollno);    // Remove rollno from HashSet and Start Again
            throw new InvalidMarksException("Marks should not be Negative or Greater than Max Marks");
           }
        }
        else 
        this.Math = marks;
        
        System.out.println("Enter the Science Marks : \n");
         marks=in.nextDouble();
        if(marks < 0 || marks > 100)
          {
            if(this.TotalMarks == 0)
           {  d.remove(rollno);    // Remove rollno from HashSet and Start Again
            throw new InvalidMarksException("Marks should not be Negative or Greater than Max Marks");
           }
        }
        else 
        this.Science = marks;
        
        System.out.println("Enter the Evs Marks : \n");
         marks=in.nextDouble();  // Remove rollno from HashSet and Start Again
        if(marks < 0 || marks > 100)
        {
            if(this.TotalMarks == 0)
           {  d.remove(rollno);   
              throw new InvalidMarksException("Marks should not be Negative or Greater than Max Marks");
           }
        }
        else 
        this.Evs = marks;
        
        // Get Total Marks
        this.TotalMarks=this.calcTotalMarks();
        
        /*  Explanation : If user Invalid Name (other than Charactors) or Invalid Marks (marks < 0 && marks > 100) then throw the Custom Exception.
                          If user gives Invalid Input,Say Charactors are given for marks then InputMismatch Exception is thrown which is Catched in General Exception Handler. 
        */
    }
    public static void main(String[] args)
    {
        int i,j,n;
        Student s[] = new Student[20];
        Scanner in = new Scanner(System.in);
        // Get the Number of Students
        System.out.println("Enter the Number of Students : \n");
        n = in.nextInt();
     
        // Fetch  Details for N students 
        System.out.println("Enter the Details for "+n+" Students : \n");
        for(i=1;i<=n;i++)
        {
          try {  
           System.out.println("-->> Enter Details for Student Number :: "+i);   
           s[i] = new Student();
           s[i].setMarks();
          }
          catch(StudentRanking.DuplicateRollnoException e)
          {
              System.out.print(e+"Re-enter Again \n");     
              i=i-1; // Go back & Do it again
          }
          catch(StudentRanking.InvalidNameException e)
          {
              System.out.print(e+"Re-enter Again \n");
              i=i-1; // Go back & Do it again
          }
          catch(StudentRanking.InvalidMarksException e)
          {
              System.out.println(e+"Re-enter  Again \n");
              i=i-1; // Go back & Do it again
              
          }
          catch(Exception e)
          {
              System.out.println(e+"\t Try Again \n"); // Print Default Exception if Any - Like InputMismatch
              i=i-1;  // Go back & Do it again
             Integer store=null;
              Iterator v=d.iterator(); 
             while (v.hasNext()) 
                store=(Integer)v.next();
             d.remove(store); // Remove Rollno Safely for General Exception
          }
        }     
        // Use LinkedList Collection which is much faster than ArrayList to Store the Students Records and Duplicates are Handled Safely Above
        LinkedList<Student> st=new LinkedList();
        for(i=1;i<=n;i++)
            st.add(s[i]); 
       
        // Sort the Collection using RankSort.java
        Collections.sort(st,new RankSort());  
        Iterator itr=st.iterator();  
        System.out.println("Rank \t\t Rollno \t\t Name \t\t Lang1 \t\t Lang2 \t\t Math \t\t Science \t\t Evs \t\t TotalMarks  \n");
        Iterator itr2=st.iterator();  
        while(itr2.hasNext()){  
         Student e=(Student)itr2.next(); 
         Rank=Rank+1;
            e.getMarks(Rank);
        }
    }    
}
class InvalidMarksException extends Exception{  
 InvalidMarksException(String s){  
  super(s);  
 }  
}
class DuplicateRollnoException extends Exception{  
 DuplicateRollnoException(String s){  
  super(s);  
 }  
}
class InvalidNameException extends Exception{  
 InvalidNameException(String s){  
  super(s);  
 }  
}
