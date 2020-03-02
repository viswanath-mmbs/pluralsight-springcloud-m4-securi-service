package pluralsight.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class teststring {

	public static void main(String[] args) {
		String str = "a!bb@cdef!hig$";
//					  "g!ih@fedc!bba$"
		Map<Integer, Character> map = new HashMap<>();
		String reverseString = "";
		for (int i = str.length() - 1 ; i >= 0 ; i--) {
			if (!Character.isAlphabetic(str.charAt(i))) {
				map.put(i, str.charAt(i));
			} else  {
				reverseString = reverseString + str.charAt(i);
			}
		}
		
		Set<Integer> s = map.keySet();
		System.out.println(s);
		for (Integer i : s) {
			
			reverseString = reverseString.substring(0, i) + map.get(i) + reverseString.substring(i, reverseString.length());
		}
		
		System.out.println(reverseString);
		
		String str1 = "a!!!b.c.d,e'f,ghi"; 
        char[] charArray = str1.toCharArray(); 
  
        System.out.println("Input string: " + str1); 
                            reverse(charArray); 
        String revStr = new String(charArray); 
  
        System.out.println("Output string: " + revStr); 
		
	}
	
	
	 public static void reverse(char str[]) 
	    { 
		 
//		 	String str = "a!bb@cdef!hig$";
		 
		 
	        // Initialize left and right pointers 
	        int r = str.length - 1, l = 0; 
	  
	        // Traverse string from both ends until 
	        // 'l' and 'r' 
	        while (l < r)  
	        { 
	            // Ignore special characters 
	            if (!Character.isAlphabetic(str[l])) 
	                l++; 
	            else if(!Character.isAlphabetic(str[r])) 
	                r--; 
	  
	            // Both str[l] and str[r] are not spacial 
	            else 
	            { 
	                char tmp = str[l]; 
	                str[l] = str[r]; 
	                str[r] = tmp; 
	                l++; 
	                r--; 
	            } 
	        }
	    }
}
