import java.util.Scanner;

public class VR {
    public static double Rad(double x0,double y0,double z0,double x1,double y1,double z1){
        double radius = Math.sqrt((x1 - x0) * (x1 - x0) +
                (y1 - y0) * (y1 - y0) + (z1 - z0) * (z1 - z0));
        return radius;
    }
    public static double VOL(double x0,double y0,double z0,double x1,double y1,double z1){
        double vol = (4 * (Math.PI)*Math.pow(Rad(x0, y0, z0, x1, y1, z1),3)) / 3;
        return vol;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double x0 = scanner.nextFloat();
            double y0 = scanner.nextFloat();
            double z0 = scanner.nextFloat();
            double x1= scanner.nextFloat();
            double y1 = scanner.nextFloat();
            double z1 = scanner.nextFloat();

            System.out.printf("%.3f",Rad(x0,y0,z0,x1,y1,z1));
            System.out.print(" ");
            System.out.printf("%.3f",VOL(x0,y0,z0,x1,y1,z1));
            System.out.print(" ");

        }
    }
}
