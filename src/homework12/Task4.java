package homework12;

public class Task4 {

    public static void main(String[] args) {

        String str="This is sentence i want to reverse";

        String[] words = str.split(" ");
        String reverseStr = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseStr = reverseStr + reverseWord + " ";
        }
        System.out.println(reverseStr);



    }
}
