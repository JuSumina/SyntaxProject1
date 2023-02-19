package class32;

public class InsuranceTest {

    public static void main(String[] args) {

        Insurance carPolicy = new CarPolicy ("I19697", "John Smith", 100, 30);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("P9895", "Jane Doe", 50,5);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());


    }
}
