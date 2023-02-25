package homework23;

import java.util.ArrayList;

public class InsuranceTest {

    public static void main(String[] args) {

        Car carInsurance = new Car();
        Pet petInsurance = new Pet();
        Health healthInsurance = new Health();

        ArrayList <Insurance> insurance = new ArrayList<>();
        insurance.add(carInsurance);
        insurance.add(petInsurance);
        insurance.add(healthInsurance);

        for (Insurance i:insurance) {
            i.getQuote();
            i.cancelInsurance();
        }

    }
}
