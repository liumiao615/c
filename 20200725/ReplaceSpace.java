import java.util.*;
import java.lang.String;
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
		/*
		StringBuffer sb = new StringBuffer();
        String S = "";
        String s = str.toString();
        char[] arr = s.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == ' '){
                sb.append("%20");
            }else {
                sb.append(arr[i]);
            }
        }
        S += sb;
        return S;
		*/
        int i = 0;
        for(int j = 0;j < str.length();j++){
            if(str.charAt(j) == ' '){
                i++;
            }
        }
        int new_length = str.length() + 2*i;
        int old_end = str.length() - 1;
        int new_end = new_length - 1;
        str.setLength(new_length);
        
        while(old_end >= 0 && new_end >= 0){
            if(str.charAt(old_end) == ' '){
                str.setCharAt(new_end--,'0');
                str.setCharAt(new_end--,'2');
                str.setCharAt(new_end--,'%');
                --old_end;
            }else{
                str.setCharAt(new_end--,str.charAt(old_end));
                --old_end;
            }
        }
        return str.toString();
    }
}