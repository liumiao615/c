import java.util.ArrayList;
import java.util.Scanner;

public class MUBANG {
    public static boolean canFormPoly(ArrayList<Integer> list){
        int len = list.size();
        for(int i = 0;i < len;i++){
            int tmp = list.remove(i);
            int sum = 0;
            for(int j = 0;j < len-1;j++){
                sum += list.get(j);
            }
            if(sum <= tmp){
                list.add(i,tmp);
                return false;
            }
            list.add(i,tmp);
        }
        return true;
    }
    public static void stickPuzzle(int n,int[][] op){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(op[i][0] == 1){
                list.add(op[i][1]);
            }else {
                list.remove(new Integer(op[i][1]));
            }
            if(canFormPoly(list)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList list = new ArrayList();
        while (scanner.hasNext()) {
            int total = scanner.nextInt();
            int[][] op = new int[total][2];
            for(int i = 0;i < total;i++){
                op[i][0] = scanner.nextInt();
                op[i][1] = scanner.nextInt();
            }
            stickPuzzle(total,op);
        }
    }
}
