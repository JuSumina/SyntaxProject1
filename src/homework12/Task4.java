package homework12;

public class Task4 {

    public static void main(String[] args) {

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for(String words:arr) {
            for(int i=words.length()-1; i>=0; i--){
                System.out.print(words.charAt(i));
            }
            System.out.print(" ");
        }



    }
}
