public class SquenceOfBTS {
public boolean VerifySquenceOfBSTCore(int [] sequence, int start, int end){
if(start >= end){
//在不断查找过程中，区域不断缩小，为空时，证明之前的所有范围都满足检测条件
//也就是是一个BST
return true;
} /
/拿到root节点的值
int root = sequence[end];
//先遍历左半部分，也就是整体都要比root小，拿到左子树序列
int i = 0;
while(i < end && sequence[i] < root){
i++;
} /
/在检测右子树是否符合大于root的条件,要从i开始，也就是右半部分的开始
for(int j = i; j < end; j++){
if(sequence[j] < root){
return false;
}
}
//走到这里，就说明，当前序列满足需求。但并不代表题目被解决了，还要在检测left和right各自是否也满足
return VerifySquenceOfBSTCore(sequence, 0, i-1) && VerifySquenceOfBSTCore(sequence,
i, end-1);
} 
public boolean VerifySquenceOfBST(int [] sequence) {
if(sequence.length == 0){
return false;
} 
return VerifySquenceOfBSTCore(sequence, 0, sequence.length-1);
}
}