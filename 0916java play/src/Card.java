//实现一副牌
public class Card {
   public int value;
   public String color;

    Card(int value,String colar){
        this.value=value;
        this.color=colar;
    }

    @Override
    public String toString(){
        String v;
        if(value==1){
            v="A";
        }else if(value==11){
            v="J";
        }else if(value==12){
            v="Q";
        }else if(value==13){
            v="K";
        }
        else{
            v=String.valueOf(value);
        }
        return String.format("[%s %s]",color,v);
    }
}
