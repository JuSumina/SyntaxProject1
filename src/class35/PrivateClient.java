package class35;

public class PrivateClient {

    private String name;
    private long ssn;

    PrivateClient (String name, long ssn) {
        if(name!=null && !name.isEmpty()){
            this.name=name;
        }
    }

    public String getName() {
        return name;
    }
}
