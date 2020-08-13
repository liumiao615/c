public class BTS {
    public boolean BTS1(int[]sequence,int start,int end){
        if(start >= end){
            return true;
        }
        int root = sequence[sequence.length - 1];
        int i = start;
        while(i < end && sequence[i] < root){
            i++;
        }
        for(int j = i;j < end;j++){
            if(sequence[j] < root){
                return false;
            }
        }
        
        return BTS1(sequence,start,i - 1)&&BTS1(sequence,i,end-1);
    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0 || sequence == null){
            return false;
        }
        return BTS1(sequence,0,sequence.length - 1);
    }
}