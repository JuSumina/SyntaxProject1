package class24;

public class SportTest {

    public static void main(String[] args) {

        Cricket c=new Cricket("Cricket", "Pakistan", "Green Helmet");
        c.display();

        Soccer s=new Soccer("Soccer", "Argentina", "PSG", 11);
        s.display();
        s.displayTeam();
    }
}
