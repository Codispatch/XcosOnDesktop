/**
 * Name : Shravan C
 * College : Manipal Institute of Technology
 * < -- Other Details -->
  * Sources for ref: Java Complete Reference 9th Edtition ,JavaTpoint etc
 */

package StudentRanking;
import java.util.*;
import java.lang.*;

class RankSort implements Comparator {
   // Override Compare method of Object Class

 public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.getTotalMarks()==s2.getTotalMarks())  
{
            if(s1.getMath()==s2.getMath())
            {
                if(s1.getScience() ==s2.getScience())
                {
                     if(s1.getEvs() == s2.getEvs())
                    {
                        if(s1.getLang1() == s1.getLang1())
                           {
                                if(s1.getLang2() == s2.getLang2())
                                        return s1.getName().compareTo(s2.getName()); // Use CompareTo of String Class for Name Sorting
                                    else if(s1.getLang2() > s2.getLang2())  
                                        return -1;
                                     else 
                                        return 1;
                           }
                            else if(s1.getLang1()>s2.getLang1())
                                return -1;
                            else 
                                return 1;
                    }
                    else if(s1.getEvs()>s2.getEvs())
                        return -1;
                    else 
                        return 1;
                }
                else if(s1.getScience()>s2.getScience())
                    return -1;
            else 
                    return 1;
            }
            else if(s1.getMath()>s2.getMath())
                    return -1;
            else 
                    return 1; 
} 
else if(s1.getTotalMarks()>s2.getTotalMarks())  
    return -1;  
else  
    return 1;  
}  
    
}
