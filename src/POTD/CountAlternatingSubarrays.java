////Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        List<Integer> nums = new ArrayList<>();
////        for(int i=0;i<n;i++){
////        int x = sc.nextInt();
////        nums.add(x);
////        }
////        int sum1=Sum(n);
////        int sum=0;
////        int sum3=0;
////        for(int i=0;i<nums.size();i++){
////        sum3+=nums.get(i);
////        }
////        Set<Integer> hash_Set = new HashSet<Integer>();
////        for(int i=0;i<nums.size();i++){
////        hash_Set.add(nums.get(i));
////        if(hash_Set.contains(nums.get(i))){
////        sum+=nums.get(i);
////        }
////
////        }
////        int[] ans = new int[2];
////        ans[1]=sum1-sum;
////        ans[0]=sum3-sum;
////        for(int i=0;i<ans.length;i++){
////        System.out.print(ans[i]+" ");
////        }
////
////        }
////public static int Sum(int n){
////        int sum=0;
////        for(int i=1;i<=n ; i++){
////        sum+=i;
////        }
////        return sum;
////        }
//
//
//
////----------------------------------------------
//
///******************************************************************************
// Online JAVA Language Compiler.
// Write your code in this editor and press "Run" button to execute it.
// *******************************************************************************/
//import java.util.*;
//class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        HashSet<Integer> set = new HashSet<>();
//        int sum1 = 0;
//        int sum2 = 0;
//        int repeated = -1;
//        for(int i = 0 ; i < n ; i++){
//            int x = sc.nextInt();
//            if(!set.contains(x)){
//                sum1 += x;
//            }
//            else{
//                repeated = x;
//            }
//
//            set.add(x);
//            sum2 += i+1;
//        }
//        System.out.println(repeated + " " + (sum2 - sum1));
//
//    }
//}