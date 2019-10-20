public class Solution {
    public static void main(String[] args) {
       double[] Y = new double[1000];
       double[] X = new double[1000];
        Y[1] = X[0] = 0.947;
        int i ;
        for(i = 1;i >= 0;i++){
           X[i] = Y[i]/(2.47 - 1.47 * Y[i]);
          if(X[i] >= 0.44){
               Y[i+1] = 0.778 * X[i] + 0.217;
           }else {
              if (X[i] < 0.0235) {
                  System.out.println(i + 1);
                  break;
              }else {
                  Y[i + 1] = 1.29 * X[i] - 0.0068;
              }
          }
       }
    }
}
