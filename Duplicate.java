package week3Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
   int[] data = {4,3,6,8,29,1,2,4,7,8};
   Set<Integer> s1 = new LinkedHashSet<>();
   Set<Integer> dup= new LinkedHashSet<>();
   
   for (int i = 0; i < data.length; i++) {

	   boolean add1 = s1.add(data[i]);
	   if(!add1) {
		   
		   dup.add(data[i]);
		   
	   }
	   
} 
	
   // System.out.println(s1);	
   System.out.println(dup);
   
   

	}

	

}
