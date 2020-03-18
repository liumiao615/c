public class LCA {
    public static int getLCA(int a, int b) {
        // write code here
        int fatherA = a;
        int fatherB = b;
        while(fatherA != fatherB ){
            if(fatherA == 1 || fatherB == 1){
                break;
            }
            if(fatherA > fatherB) {
                fatherA = fatherA / 2;
            }else {
                fatherB = fatherB / 2;
            }
        }
        if(fatherA == fatherB){
            return fatherA;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLCA(8,16));
    }
}
