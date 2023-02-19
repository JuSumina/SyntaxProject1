package tests9;

public class Test157 {

    static final double avgElements(double [] a) {
        double sum=0;
        for (int i=0; i< a.length; i++) {
            sum=a[i]+sum;
        }

        return sum/a.length;

    }

    public static void main(String[] args) {

        Test157 average = new Test157();
        double[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
