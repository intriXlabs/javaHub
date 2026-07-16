public class Main{
    public static void LON(int NUM) {
        int len=1;
        if(NUM<0)
            NUM/=-1;
        while(NUM>0){
            NUM=NUM/10;
            NUM/=10;
            len++;
        }
        System.out.println("length of number: "+len);
    }
    public static void main(String[] args) {
        LON(-98);
    }
}