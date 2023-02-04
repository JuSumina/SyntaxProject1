package tests7;

public class MyTest124 {

    int sumEvenToX(int x) {

        int sum = 0;

        for( int i=0; i<=x; i++) {
            if (i % 2 == 0) {
                sum += i;

            }
        }
        return sum;
    }

    public static void main(String[] args) {

        MyTest124 md = new MyTest124();

        System.out.println(md.sumEvenToX(5));


    }
}
