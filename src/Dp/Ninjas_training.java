package Dp;

import java.util.Arrays;

public class Ninjas_training {
    public static void main(String[] args) {
        int[][] arr ={{2,1,3},{3,4,6},{10,1,6},{8,3,7}};
        int n = arr.length;
        // what parameters are changing (day/index and last)
//        so we make dp array of N and 4
        int[][] dp = new int[n][4];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
//        System.out.println(Ninja(n-1,3,arr,dp));
        System.out.println(Bottom_Up(n,arr));
    }
    public static int Ninja(int day,int last,int[][] arr,int[][] dp){

        if(dp[day][last]!=-1){
            return dp[day][last];
        }


        // writing base condition
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi = Math.max(maxi,arr[0][task]);
                }
            }
            return maxi;
        }
        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last)
            {
                int point = arr[day][task]+ Ninja(day-1,task,arr,dp);
                maxi=Math.max(maxi,point);
            }
        }
        dp[day][last]=maxi;
        return maxi;
    }

    // Bottom Up approach
    public static int Bottom_Up(int n , int[][] arr){
        int[][] dp = new int[n][4];
        // filling base cases
        dp[0][0]=Math.max(arr[0][1],arr[0][2]);
        dp[0][1]=Math.max(arr[0][0],arr[0][2]);
        dp[0][2]=Math.max(arr[0][1],arr[0][0]);
        dp[0][3]=Math.max(arr[0][0],Math.max(arr[0][1],arr[0][2])); // ho skta ho sirf 1 hi day ho to hum teeno m se max nikalke return karenge

        // now we will start from day1
        for(int day=1 ;day<n;day++){
            for(int last =0;last<4 ; last++){
                int maxi=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point = arr[day][task]+dp[day-1][task];
                        maxi=Math.max(maxi,point);
                    }
                }
                dp[day][last]=maxi;
                // us particular day par us last ko chorke mujhe bta de ki kya heighest ban rha h saare tasks m se
            }

        }
        return dp[n-1][3];

    }
}
