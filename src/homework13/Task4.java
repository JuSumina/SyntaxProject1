package homework13;

public class Task4 {

    String greeting(String myCountry) {

        switch (myCountry) {
            case "USA":
                return "Hello";

            case "Ukraine":
                return "Привіт";

            case "Spain":
                return "Hola";

            case "Italy":
                return "Ciao";

            default:
                return "Unknown country";
        }
    }
}
