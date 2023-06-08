package week3Collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
String name = "VVidhyaa";

char[] ch = name.toCharArray();
Set<Character> unq = new HashSet<>();
// Set<Character> dup = new HashSet<>();

for (int i = 0; i < ch.length; i++) {
	
	boolean add = unq.add(ch[i]);
	
	if(!add)
	{
		unq.remove(ch[i]);
	}
	
	
	
}
System.out.println(unq);
	}
	
}
