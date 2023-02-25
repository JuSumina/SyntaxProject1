package homework23;

public abstract class Insurance {

    String  insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();

}

class Car extends Insurance {

    String carModel;

    @Override
    void getQuote() {
        System.out.println("The price for your car insurance will be based on the number of accidents you had");

    }

    @Override
    void cancelInsurance() {
        System.out.println("You can cancel your car insurance at any time");

    }
}

class Pet extends Insurance {

    String petType;

    @Override
    void getQuote() {
        System.out.println("The price for your pet insurance will be based on the age of your pet");

    }

    @Override
    void cancelInsurance() {
        System.out.println("You can cancel your pet insurance at any time");

    }
}

class Health extends Insurance {

    @Override
    void getQuote() {
        System.out.println("The price for your health insurance will be based on your income");

    }

    @Override
    void cancelInsurance() {
        System.out.println("You can cancel your health insurance at any time");

    }
}
