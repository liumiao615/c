import java.util.Scanner;

public class S {
    public static String change(int a){
        final String[] hanzi = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
        int qian = a/1000;
        int bai = (a - qian * 1000)/100;
        int shi = (a - qian * 1000 - bai * 100)/10;
        int ge = a - qian * 1000 - bai * 100 - shi * 10;
        StringBuffer sb = new StringBuffer();
        if(qian != 0){
            sb.append(hanzi[qian] + "仟");
        }
        if(bai != 0){
            sb.append(hanzi[bai] + "佰");
        }

        if(shi != 0 && shi != 1){
            sb.append(hanzi[shi] + "拾");
        }else if(shi == 1 && ge != 0){
            sb.append("拾");
        }

        if(ge != 0){
            sb.append(hanzi[ge]);
        }
        if(qian != 0 && bai == 0){
            sb.append("零");
        }
        if(qian != 0 && shi == 0){
            sb.append("零");
        }
        if(bai != 0 && shi == 0){
            sb.append("零");
        }

        String s = sb.toString();
        return s;
    }
    public static void main(String[] args) {
        final String[] hanzi = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾"};
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            double money = scanner.nextDouble();
            StringBuffer buffer = new StringBuffer("人民币");
            int yi = (int) (money / 100000000);
            if(yi > 0){
                buffer.append(change(yi) + "亿");
            }
            int wan = (int)(money - yi * 100000000)/10000;
            if(wan > 0){
                buffer.append(change(wan) + "万");
            }
            int yuan = (int)(money - yi * 100000000 - wan * 10000);
            if(yuan > 0){
                buffer.append(change(yuan) + "元");
            }

            int yushu = (int) ((money - yi * 100000000 - wan * 10000 - yuan + 0.001) * 100);
            int jiao = yushu/10;
            int fen = yushu % 10;
            if(jiao != 0 && fen != 0){
                buffer.append(hanzi[jiao] + "角" + hanzi[fen] + "分");
            }else if(jiao == 0 && fen != 0){
                buffer.append(hanzi[0] + hanzi[fen] + "分");
            }else if(jiao != 0 && fen == 0){
                buffer.append(hanzi[jiao] + "角");
            }else {
                buffer.append("整");
            }
            String S = buffer.toString();
            System.out.println(S);
        }
    }
}
