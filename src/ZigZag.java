
public class ZigZag {
	
	public static String convert(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows <= 1){
            return s;
        }
        StringBuilder buffer = new StringBuilder();
        int strLen = s.length();
        boolean plus;
        for(int i = 0;i < strLen;){
            buffer.append(s.charAt(i));
            i += (numRows - 1) * 2;
        }
        for(int i = 1; i < numRows - 1; ++i){
            int  j = i;
            plus = true;
            while(j < strLen){
               buffer.append(s.charAt(j)); 
               if(plus){
                   j += (numRows - i - 1) * 2;
                   plus = false;
               }else{
                   j += i * 2;
                   plus = true;
               }
            }
        }
        for(int i = numRows - 1;i < strLen;){
            buffer.append(s.charAt(i));
            i += (numRows - 1) * 2;
        }
        return buffer.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("ABC",2));
		System.out.println("PAHNAPLSIIGYIR");
	}

}
