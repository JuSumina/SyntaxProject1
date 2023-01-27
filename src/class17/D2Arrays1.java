package class17;

public class D2Arrays1 {

    public static void main(String[] args) {

        int [][] array={
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };

        int numberOfArrays=array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Array=array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numberofElementsIn4Array=array[3].length;
        System.out.println(numberofElementsIn4Array);

        System.out.println(array[2][1]);





    }
}
