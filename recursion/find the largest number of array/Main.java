public class Main{
    public static int isLargest(int first, int second) {
        if(first > second)
            return first;
        else{
            return second;
        }
    }
    public static int LNA(int[] args, int size) {
        if(size==-1)
            return 0;

        return isLargest(args[size], LNA(args, size-1));
    }
    public static void main(String[] args) {
        int[] arr={1,56,32,87,4};
        int size=5-1;
        System.out.println(LNA(arr, size));
    }
}