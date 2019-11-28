public class Main3 {
    public static void main(String[] args) {
        long Rich = 0;
        long Stranger = 0;

        for(int i = 1;i <= 30;i++){
            Rich += 10;
            Stranger += Math.pow(2,i - 1);

        }
        System.out.println(Rich +  " " + Stranger);
        //System.out.println(Stranger);
    }
}
