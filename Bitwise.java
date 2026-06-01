import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();
        int flag1=0;
        int flag2=0;
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                flag1=flag1 | (1<<(c-'a'));
            }
            else if(c>='A' && c<='Z'){
                flag2=flag2 | (1<<(c-'A'));
            }
            else continue;
        }
        System.out.println(((flag1==(1<<26)-1)&&(flag2==(1<<26)-1))?"YES":"NO");
    }
}
