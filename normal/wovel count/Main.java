public class Main{
    public static boolean  isWovel(char args) {
        char[] wovels={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0; i<10; i++){
            if(args == wovels[i])
                return true;
        }
        return false;
    }
    public static void WC(String args) {
        int len=0;
        for(int i=0; i<args.length(); i++){
            if(isWovel(args.charAt(i)))
                len++;
        }
        System.out.println("woven count: "+len);
    }
    public static void main(String[] args) {
        WC("hi john how are you");
    }
}