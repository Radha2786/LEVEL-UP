package Dp;
public class Ninjas_training {
    public static void main(String[] args) {
        int[][] arr ={{2,1,3},{3,4,6},{10,1,6},{8,3,7}};
        int n = arr.length;
        System.out.println(Ninja(n-1,3,arr));
    }
    public static int Ninja(int day,int last,int[][] arr){
        // writing base condition
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi = Math.max(maxi,arr[0][task])
                }
            }
            return maxi;
        }
        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last)
            {
                int point = arr[day][task]+ Ninja(day-1,task,arr);
                maxi=Math.max(maxi,point);
            }
        }
        return maxi;
    }
}
