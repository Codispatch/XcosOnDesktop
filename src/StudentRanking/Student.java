/**
 * Name : Shravan C
 * College : Manipal Institute of Technology
 * < ------------SAMPLE INPUT ------------------>
 * Enter the Number of Students :  5
   Enter the Details for N Students : 
* 
   Enter the Rollnumber : 130905414
   Enter the Name : shravan
   Enter the Language 1 Marks : 100
   Enter the Language 2 Marks : 100
   Enter the Math Marks : 90
   Enter the Science Marks : 90
   Enter the Evs Marks :  90
* 
   Enter the Rollnumber : 130905404
   Enter the Name : megha
   Enter the Language 1 Marks : 100
   Enter the Language 2 Marks : 100
   Enter the Math Marks : 90
   Enter the Science Marks : 90
   Enter the Evs Marks : 90
* 
   Enter the Rollnumber : 130905402
   Enter the Name : shreya
   Enter the Language 1 Marks : 100
   Enter the Language 2 Marks : 100
   Enter the Math Marks : 95
   Enter the Science Marks : 96
   Enter the Evs Marks : 97
* 
   Enter the Rollnumber : 130905403
   Enter the Name :  nikhil
   Enter the Language 1 Marks : 99
   Enter the Language 2 Marks : 99
   Enter the Math Marks : 100
   Enter the Science Marks : 100
   Enter the Evs Marks : 100
* 
   Enter the Rollnumber : 130905405
   Enter the Name : rohit
   Enter the Language 1 Marks : 98
   Enter the Language 2 Marks : 99
   Enter the Math Marks : 99
   Enter the Science Marks : 98
   Enter the Evs Marks : 97

*<----- SAMPLE OUTPUT ------>
Rank 		 Rollno 		 Name 		 Lang1 		 Lang2 		 Math 		 Science 		 Evs 		 TotalMarks  

1		130905403		nikhil		99.0		99.0		100.0		100.0			100.0		498.0
2		130905405		rohit		98.0		99.0		99.0		98.0			97.0		491.0
3		130905402		shreya		100.0		100.0		95.0		96.0			97.0		488.0
4		130905404		megha		100.0		100.0		90.0		90.0			90.0		470.0
5		130905414		shravan		100.0		100.0		90.0		90.0			90.0		470.0
* < -- Other Details -->
* Sources for ref: Java Complete Reference 9th Edtition ,JavaTpoint etc
* One drawback I found later at the end,The LinkedList which I have used can contain duplicates- To solve this problem we can put the list to HashSet and then put them back,
* So that all duplicates can be removed safely.
 */

package StudentRanking;
import java.util.*;
import java.io.*;

public class Student  {
    
    private int Rollno;
    public static int Rank;
    private double TotalMarks;
    private String Name;
    private double Lang1;
    private double Lang2;
    private double Math;
    private double Science;
    private double Evs;
    
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
    public double calcTotalMarks()
    {
        return (this.Lang1 + this.Lang2 + this.Math + this.Science + this.Evs );
    }
     public void getMarks(int Rank)
    {
     
        System.out.println(Rank+"\t\t"+this.Rollno+"\t\t"+this.Name+"\t\t"+this.Lang1+"\t\t"+this.Lang2+"\t\t"+this.Math+"\t\t"+this.Science+"\t\t\t"+this.Evs+"\t\t"+this.TotalMarks);
    }
    public void setMarks()
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Rollnumber : \n");
        this.Rollno = in.nextInt();
        System.out.println("Enter the Name : \n");
        this.Name = in.next();
        System.out.println("Enter the Language 1 Marks : \n");
        this.Lang1 = in.nextDouble();
        System.out.println("Enter the Language 2 Marks : \n");
        this.Lang2 = in.nextDouble();
        System.out.println("Enter the Math Marks : \n");
        this.Math = in.nextDouble();
        System.out.println("Enter the Science Marks : \n");
        this.Science = in.nextDouble();
        System.out.println("Enter the Evs Marks : \n");
        this.Evs = in.nextDouble();
        this.TotalMarks=this.calcTotalMarks();
        
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
        System.out.println("Enter the Details for N Students : \n");
        for(i=0;i<n;i++)
        {  s[i] = new Student();
           s[i].setMarks();
        } 
            
        // Use Collection to Store the Students Records
        LinkedList<Student> st=new LinkedList();
        for(i=0;i<n;i++)
            st.add(s[i]); 
       
        // Sort the Collection using RankSort
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
    
    
    

