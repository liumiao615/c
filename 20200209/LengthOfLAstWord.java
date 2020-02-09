public class LengthOfLAstWord {
    public static int LengthOfLAstWord(String s){
        String[] str = s.split(" ");
        int length = str.length;
        if(length < 0){
            return 0;
        }
        char[] Arr = str[length - 1].toCharArray();
        return Arr.length;
    }

    public static void main(String[] args) {
        System.out.println(LengthOfLAstWord("Hello world"));
    }
}
