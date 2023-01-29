package homework13;

public class Task5 {

    boolean primeOrOdd(int num1){

        if (num1>1) {
            for (int i=2; i<num1; i++) {
                if (num1%i==0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;

    }

}
