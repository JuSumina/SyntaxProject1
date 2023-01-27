package homework10;

public class DigitalClock2 {

    public static void main(String[] args) {

        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <=9; j++) {
                if (i==2 && j==4) {
                    break;
                }
                for (int k=0; k<59; k++) {
                    if (k<10) {
                        System.out.println(i + "" + j + " : 0" + k);
                    } else {

                        System.out.println(i+ "" +j+" : "+k);
                    }
                }
            }

        }
    }

}

