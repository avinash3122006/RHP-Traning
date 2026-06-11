// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the string:");
        String s= sc.nextLine();
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            sum+=(s.charAt(i)=='1')?1:-1;
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
}
