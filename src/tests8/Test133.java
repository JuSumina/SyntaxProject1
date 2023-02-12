package tests8;

public class Test133 {

    static String maxLength (String [] arr) {

        String maxWord = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > maxWord.length()) {
                maxWord = arr[i];
            }
        }
        return maxWord;

    }

    public static void main(String[] args) {

        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"


    }
}
