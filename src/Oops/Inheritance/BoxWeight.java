package Oops.Inheritance;

public class BoxWeight extends Box{
    int weight ;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(int l, int h, int w, int weight){
        super(l, h, w); // call the parent class constructor
        // used to initialise value present in parent class
        this.weight= weight;
    }
}
