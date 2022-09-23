import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String add = sc.nextLine();
        System.out.println(ValidateIpv4Address(add));
    }
    public static boolean ValidateIpv4Address(String add){
        int cnt = 0;
        String curr = "";
        boolean flg=true;
        for(int i=0;i<add.length();i++){
            char c=add.charAt(i);
            if(c=='.'){
                int x=Integer.valueOf(curr);
                if(curr.length()>33 || x<0  || x>255)
                {
                    return false;
                }
                curr = "";
                cnt++;
            }
            else if(c>='0' && c<='9'){
                curr = curr+c;
            }
            else{
                return false;
            }
        }
        if(curr.length()==0){
            return false;
        }
        int last = Integer.valueOf(curr);
        if(cnt==3 && last>0 && last<255){
            return true;
        }
        return false;
    }
}