import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();
        int flag=0;
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                flag=flag | (1<<(c-'a'));
            }
        }
        System.out.println((flag==(1<<26)-1)?"YES":"NO");
    }
}
