public class Main{
    public static void ALN(int[] args){
        int LN = 0;
        for(int i=0; i< args.length; i++){
            if(LN<args[i]){
                LN=args[i];
            }
        }
        System.out.println("largest number of array: " +LN);
    }
    public static void main(String[] args) {
        int[] nums = {12,45,83,1,8};
        ALN(nums);
    }
}