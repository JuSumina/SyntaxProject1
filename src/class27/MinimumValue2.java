package class27;

public class MinimumValue2 {

    public static int minFromArray(int[] array){

        int min=array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]<i){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {


        int[] array={10,49,89,60};
        MinimumValue2.minFromArray(array);
        int minimum=minFromArray(array);
        System.out.println("Min number ="+ minimum);
    }

}

