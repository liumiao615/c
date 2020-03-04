import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Map<String,Integer> map = new HashMap<>();
            int Hpeople = scanner.nextInt();
            for(int i = 0;i < Hpeople;i++){
                map.put(scanner.next(),0);
            }
            int Xpeople = scanner.nextInt();
            int Invalid = 0;
            for(int j = 0;j < Xpeople;j++){
                String temp = scanner.next();
                if(map.get(temp) == null){
                    Invalid++;
                }else {

                    map.put(temp,map.get(temp) + 1);
                }
            }
            for(Map.Entry entry:map.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : " + Invalid);
        }
    }
}
