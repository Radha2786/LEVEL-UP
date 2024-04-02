package POTD;

public class WaterBottlesII {
    public static void main(String[] args) {
        int numBottles = 10;
        int numExchange = 3;
        int EmptyBottles=0;
        int bottledrunk=0;
        while(EmptyBottles>=numExchange || numBottles!=0){
            if(EmptyBottles<numExchange){
                bottledrunk=bottledrunk+numBottles;
                EmptyBottles=EmptyBottles+numBottles;
                numBottles=0;

            }else{
                numBottles= numBottles+1;
                EmptyBottles= EmptyBottles-numExchange;
                numExchange=numExchange+1;
            }
        }
//        return bottledrunk;
        System.out.println(bottledrunk);
    }
}
