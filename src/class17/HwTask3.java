package class17;

public class HwTask3 {

    public static void main(String[] args) {

        int [][] numbers= {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };

        int sum=0;
        for (int [] nums:numbers) {
            for (int num:nums) {
                sum+=num;
            }
        }
        System.out.println("The total is "+sum);
    }
}
