public class Main{
    public static int isWovel(char args) {
        char[] wovels={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i<10; i++){
            if(args == wovels[i])
                return 1;
        }
        return 0;
    }
    public static int WC(String s, int index) {

        if(index==s.length())
            return 0;

        return WC(s, index+1)+isWovel(s.charAt(index));
    }
    public static void main(String[] args) {
        String s="hi john how are you";
        System.out.println(WC(s, 0));
    }
}