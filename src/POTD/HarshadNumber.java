package POTD;

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 18;
        int sum=0;
        int originalnumber=x;
        while(x!=0){
            int n = x%10;
            sum=sum+n;
            x=x/10;
        }
        if(originalnumber % sum==0){
            System.out.println(sum);
        }else{
            System.out.println(-1);
        }
    }
}
