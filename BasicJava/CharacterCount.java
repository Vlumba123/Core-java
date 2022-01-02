package BasicJava;

public class CharacterCount {
 public static void main(String[] args) {
	 int wordcount = 0; 
 
	 String word= "Vijay Dinanath Chauhan";
	 
	 for (char letter ='a'; letter<='z'; letter ++) {
	  for (int i=0; i<word.length(); i++) {
		 if (word.charAt(i)==letter) {
			wordcount ++;
		 }
	 }
	  if (wordcount>0) {
		  
	  
	 System.out.println(letter +"=" + wordcount);
	 wordcount=0;
	  }
	  
	 }
	 }
	 } 
		
	


