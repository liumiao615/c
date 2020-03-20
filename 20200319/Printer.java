import java.util.ArrayList;

public class Printer {
    public int[] arrPrinter(int[][] arr,int n){
        int[] res = new int[n * n];
       int index = 0;
       int StartX = 0;
       int StartY = n -1;
        while(StartX < n){
            int x = StartX;
            int y = StartY;
            while(x < n && y < n){
                res[index++] = arr[x++][y++];
            }
            
        }
		if(StartY > 0){
                StartY--;
            }else {
                StartX++;
            }
        return res;
    }
    public static void main(String[] args) {

    }
}
