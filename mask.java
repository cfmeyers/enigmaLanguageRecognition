import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class mask {
    static Set<Character> consonants =
	new HashSet<Character>(Arrays.asList(
	       'b','c','d','f','g','h','j','k','l','m',
	       'n','p','q','r','s','t','v','w','x','z'));

    static Set<Character> vowels =
	new HashSet<Character>(Arrays.asList('a','e','i','o','u','y'));


    public static Boolean tenConsonants(String text) {

	int consonantStreak = 0;

	Boolean test;
	for (int i = 0; i < text.length(); i++){
	    char c = text.charAt(i);        

	    if (consonants.contains(c)){
		consonantStreak += 1;
	    } else {
		consonantStreak = 0;
	    }

	    if (consonantStreak>9){
		return false;
	    }
	    
	}
	


	return true;

      
	
  }

    public static void main(String[] args) {

	System.out.println(consonants.contains('b'));
	System.out.println(consonants.contains('b'));
	System.out.println(consonants.contains('c'));
	System.out.println(consonants.contains('a'));
    }
}
