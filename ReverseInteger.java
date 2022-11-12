import java.math.BigDecimal;


class Solution {
    public int reverse(int x) {
        
        boolean ifneg = false;
        int result;
        boolean ifbigdec = false;
        String tostring;
        
        if(x<0 && Integer.MIN_VALUE>x ||x<0 && x>Integer.MIN_VALUE){
            x*=-1;
            ifneg = true;
        }
        
        else if(x<0 && Integer.MIN_VALUE==x) {
        	return 0;
        }

        tostring = Integer.toString(x);
        
        String ans = "";
        char ch;
        
        for(int i = 0; i<tostring.length(); i++){
            ch = tostring.charAt(i);
            ans = ch + ans;
        }
        
        BigDecimal idk = new BigDecimal(ans);
        BigDecimal maxvalue = new BigDecimal(Integer.MAX_VALUE);
        
         if(idk.compareTo(maxvalue) == 1) {
        	
        	return 0;
        	
        }
         else {
        result = Integer.parseInt(ans);
         }
        
        if(ifneg){
        	result*=-1;
        	
        }
        
        
        return result;
    }
}
