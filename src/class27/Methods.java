package class27;

public class Methods {

    void hello () {
        System.out.println("Hello");
    }

    void sayHello(String name) {
        System.out.println("Hello "+name);
    }

    int findLargest (int num1, int num2){
        if (num1>num2){
            return num1;
        } else {
            return num2;
        }
    }

    double average (double num1, double num2) {

        return (num1+num2)/2;
    }

    public static void main(String[] args) {

        String name="Julia";
        name.length();

        Methods obj=new Methods();

        obj.sayHello(name);

        int largest=obj.findLargest(100,280);
        System.out.println("The largest number is "+largest);

        System.out.println(obj.average(10.3, 9.3));

    }
}


