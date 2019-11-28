import java.util.Scanner;

public class Main4 {
    public static double Give(String str){
        double r = 0;
        double count = 0;
        for(char ch:str.toCharArray()){
            if(ch == 'G' || ch == 'C'){
                count++;
            }
        }
        r = count / (double)str.length();
        return r;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int t = scanner.nextInt();
        String maxStr = "";
        double maxRatio = 0;
        for(int i = 0;i < s.length() - t;i++){
            String str = s.substring(i,i + t);
            if(Give(str) > maxRatio){
                maxStr = str;
                maxRatio = Give(str);
            }
        }
        System.out.println(maxStr);
    }
}
