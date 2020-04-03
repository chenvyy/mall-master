package test;

/**
 * @author jxk
 * @create 2020-02-03 11:51
 * @desc
 **/
public class demo2 {


    public static void main(String[] args) {
        int x=10;
        int y=20;
        swap(x,y);
        System.out.println("x="+x);
    }
public static void swap(int x,int y){
    int temp=x;
    x=y;
    y=temp;
    System.out.println("X="+x);
    System.out.println("Y="+y);
}


}
