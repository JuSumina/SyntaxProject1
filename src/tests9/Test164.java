package tests9;

public class Test164 {

    long accNo;
    String name;
    String email;
    double amount;

    public void setAccNo (long accNo) {
        this.accNo=accNo;
    }

    public long getAccNo () {
        return accNo;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setEmail (String email) {
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setAmount (double amount) {
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }


    public static void main(String[] args) {

        Test164 account = new Test164();
        account.setAccNo(7560504000l);
        account.setName("Sumair");
        account.setEmail("sumair@syntax.com");
        account.setAmount(50000.0);

        System.out.println(account.getAccNo()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());


    }
}
