public class isLongPressed {
    public boolean isLongPressed(String name,String typed){
        char[] nameArray = name.toCharArray();
        char[] typedArray = typed.toCharArray();
        int i = 0;
        int j = 0;
        int namelength = nameArray.length;
        int typedlength = typedArray.length;
        if(namelength  > typedlength){
            return false;
        }
        while(i < namelength && j < typedlength){
            if(nameArray[i] == typedArray[j]){
                i++;
                j++;
            }else {
                j++;
            }
            if(i == namelength){
                return true;
            }
        }
        return false;
    }
}