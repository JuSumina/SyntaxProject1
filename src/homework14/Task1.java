package homework14;

public class Task1 {

    int arrSum(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;

        }
        return sum;
    }

    public static void main(String[] args) {

        int [] arr={10,20,30};

        Task1 task=new Task1();
        System.out.println(task.arrSum(arr));


    }
}