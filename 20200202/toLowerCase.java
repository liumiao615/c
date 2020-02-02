public class Main {
    public static String toLowerCase(String str) {
        int len = str.length();
        String ans = "";
        for (int i = 0; i < len; i++) {
            char st = str.charAt(i);
            st = tolowercase(st);
            ans += st;
        }
        return ans;
    }

    public static char tolowercase(char t) {
        if (t >= 'A' && t <= 'Z') {
            t = (char) (t + 32);
        }
        return t;
    }

    public static void mystery(int x) {
        System.out.print(x % 10);
        if ((x / 10) != 0) {
            mystery(x / 10);
        }
        System.out.print(x % 10);
    }

    public static void main(String[] args) {
//        Hello.text("World");
//        mystery(1234);
        System.out.println(toLowerCase("ABCD"));
    }
}
