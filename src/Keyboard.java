import java.util.ArrayList;

public class Keyboard {
	

    public static ArrayList<String> findWords(String[] words) {
    	String firstLine = "asdfghjkl";
    	String secondLine = "qwertyuiop";
    	String thirdLine ="zxcvbnm";
    	boolean bfirst = false, bsecond=false, bthird=false;
    	ArrayList<String> scripts = new ArrayList<String>();
    	for (String word : words) {
    		for (int i = 0; i < word.length(); ++i){
    			if (firstLine.toLowerCase().contains(String.valueOf(word.charAt(i)).toLowerCase())) {
    				bfirst=true;
    			}
    			if (secondLine.contains(String.valueOf(word.charAt(i)).toLowerCase())) {
    				bsecond=true;
    			}
    			if (thirdLine.contains(String.valueOf(word.charAt(i)).toLowerCase())) {
    				bthird=true;
    			}
    		}
    		if ((bthird ^bfirst) ^ bsecond)
    			scripts.add(word);
    		bfirst=false;
    		bsecond=false;
    		bthird=false;
    			
    	}
    	return scripts;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] plop = {"Hello", "Alaska", "Dad", "Peace"};
		ArrayList<String> tj = findWords(plop);
		System.out.println("bouh");

	}

}
