public class ReplceSpace {
    public static String replaceSpace(String iniString, int length) {
        // write code here
        char[] arr = iniString.toCharArray();
        String S = "" ;
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < length;i++){
            if((arr[i] >= 'A' && arr[i] <= 'Z') || (arr[i] >= 'a' && arr[i] <= 'z')){
                sb.append(arr[i]);
            }else {
                sb.append("%20");
            }
        }
        S += sb;
        return S;
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace("Hello  World",12));
    }
}
