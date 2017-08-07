
public class SegmentString {

	public static int countSegments(String s) {
		if (s == null || s.isEmpty()){
			return 0;
		}
		if (String.valueOf(s.charAt(0)).equals(" ")) {
			return s.substring(1).split(" ").length;
		}
		if (String.valueOf(s.charAt(s.length() -1)).equals(" ")) {
			return s.substring(0, s.length()-2).split(" ").length;
		}
        return s.split(" ").length;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSegments( ", , , ,        a, eaefa"));
	}

}
