
package ProblemStatement6;
import java.util.* ;
public class problemStatement6_1 {
public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<String>();//Creating arraylist  
    alist.add("Sachin");//Adding object in arraylist  
    alist.add("Varsha");  
    alist.add("Shivani");  
    alist.add("Aditya");
    alist.add("Simantini");
    alist.add("Snehal");
    System.out.println(alist);
    
    if (alist.contains("Sachin"))
        System.out.println("Sachin exists in the ArrayList");

    else
        System.out.println("Sachin does not exist in the ArrayList");

    if (alist.contains("Varsha"))
        System.out.println("Varsha exists in the ArrayList");

    else
        System.out.println("Varsha does not exist in the ArrayList");
    
}
}

