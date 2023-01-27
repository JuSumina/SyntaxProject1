package class16;

public class ArrayAddMachine1 {

    public static void main(String[] args) {
        int [] arr1={10,20,30,45,50};
        addArrayElements(arr1);
        int [] arr2={60,70,80,95,100};
        addArrayElements(arr2);
    }

    static void addArrayElements(int [] arr) {
        int sum=0;
        for (int number: arr) {
            sum+=number;
        }
        System.out.println(sum);
    }
}
