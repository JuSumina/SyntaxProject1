package tests10;

import java.util.LinkedList;

public class Test176 {

    public static void main(String[] args) {

        LinkedList <Integer> primeN = new LinkedList<>();

        int num=0;

        for (int i=1; i<=100; i++) {
            int counter=0;
            for(num =i; num>=1; num--) {
                if(i%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                primeN.add(i) ;
            }
        }
        System.out.println(primeN);
    }
}

