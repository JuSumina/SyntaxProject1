package class27;

public class MinimumValue {

    public static int minVal (int [] arr) {
        int min = arr[0];
        for (int i = 1; i <= arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        //int [] arr={0,5,8,4};

        //MinimumValue.minVal(arr);

        //int minimum = MinimumValue.minVal(arr);

        //System.out.println(minimum);
    }

}

