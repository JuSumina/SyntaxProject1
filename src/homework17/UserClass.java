package homework17;

public class UserClass {

    String name;
    long mobileNumber;

    UserClass (String name, long mobileNumber) {
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}

class UserInfo extends UserClass {
    String address;

    UserInfo (String name, long mobileNumber, String address) {
        super(name, mobileNumber);
        this.address=address;
    }

    void userDetails () {
        System.out.println("The user name is "+name+", and the user mobile number is "+mobileNumber+". "+name+"'s address is "+address);
    }
}
