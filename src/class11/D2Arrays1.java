package class11;

import java.util.Arrays;

public class D2Arrays1 {

    public static void main(String[] args) {

        String [] cabin0={"Adam", "Zafar", "Sam"};
        String [] cabin1={"Nabi", "Saud", "Anees"};
        String [] cabin2={"Safi", "Abeera", "Zahra"};
        String [][] thomsonTrain=new String [3] [3];

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        System.out.println(thomsonTrain[1][2]);
        System.out.println(Arrays.toString(thomsonTrain[0]));





    }
}
