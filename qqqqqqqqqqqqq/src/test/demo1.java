package test;

/**
 * @author jxk
 * @create 2020-02-03 11:20
 * @desc
 **/
public class demo1 {
    public static void main(String[] args) {
        String x="String";
        String y="String";
        String z=new String("String");
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.hashCode() == y.hashCode());
        System.out.println(x.hashCode() == z.hashCode());

    }




}
