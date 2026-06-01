import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String s=sc.nextLine();
        int l=s.length();
        for(int ctr=1;ctr<(1<<l);ctr++){
            String combi="";
            for(int sh=0;sh<l;sh++){
                if((ctr&(1<<sh))>0){
                    combi+=s.charAt(sh);
                }
            }
            System.out.println(combi);
        }
    }
}
