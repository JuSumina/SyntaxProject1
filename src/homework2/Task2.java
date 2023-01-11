package homework2;

public class Task2 {

    public static void main(String[] args) {
         double rate=4.3;
         int price = 220000;

         if (rate>4.5) {
             System.out.println("I will not buy a house");
         }
         else {
             System.out.println("I will consider buying a house");

             if (price>200000) {
                 System.out.println("I will take a loan");
             } else {
                 System.out.println("I will pay cash");
             }
         }
    }
}
