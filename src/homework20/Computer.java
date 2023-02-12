package homework20;

public class Computer {

    public void turnOn() {
        System.out.println("Computer turns on");
    }

    public void turnOff() {
        System.out.println("Computer turns off");
    }

    public void restart() {
        System.out.println("Computer restarts");
    }
}

    class Apple extends Computer {
        @Override
        public void turnOn() {
            System.out.println("Apple iMac turns on");
        }

        @Override
        public void turnOff() {
            System.out.println("Apple iMac turns off");
        }

        @Override
        public void restart() {
            System.out.println("Apple iMac restarts");
        }

        public void browser () {
            System.out.println("Apple users use Safari as their default browser");
        }
    }

    class Lenovo extends Computer {
        @Override
        public void turnOn() {
            System.out.println("Lenovo PC turns on");
        }

        @Override
        public void turnOff() {
            System.out.println("Lenovo PC turns off");
        }

        @Override
        public void restart() {
            System.out.println("Lenovo PC restarts");
        }

        public void playMusic () {
            System.out.println("Lenovo computer users use it to listen to music");
        }
    }

    class HP extends Computer {
        @Override
        public void turnOn() {
            System.out.println("HP computer turns on");
        }

        @Override
        public void turnOff() {
            System.out.println("HP computer turns off");
        }

        @Override
        public void restart() {
            System.out.println("HP computer restarts");
        }

        public void playGames() {
            System.out.println("HP computer users use it to play video games");
        }
    }

    class Dell extends Computer {
        @Override
        public void turnOn() {
            System.out.println("Dell computer turns on");
        }

        @Override
        public void turnOff() {
            System.out.println("Dell computer turns off");
        }

        @Override
        public void restart() {
            System.out.println("Dell computer restarts");
        }

        public void watchMovies() {
            System.out.println("Dell computer users use it to watch movies");
        }
    }

