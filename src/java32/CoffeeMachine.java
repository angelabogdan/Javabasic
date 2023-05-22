package java32;

public class CoffeeMachine {
    public class CoffeMachine extends Electronics {

        private static final String TYPE = "Coffee Machine";
        private String name;
        private boolean state;

        public void CoffeeMachine(String name) {
            this.name = name;
            this.state = false;
        }

        public CoffeMachine(String name) {
            this.name = name;
        }

        public String getType() {
            return TYPE;
        }

        public String getName() {
            return this.name;
        }

        public void turnOn() {
            if (state) {
                System.out.println(TYPE + " ALREADY ON!");
            } else {
                this.state = true;
                System.out.println(TYPE + " TURNED ON!");
            }
        }

        public void turnOff() {
            if (!state) {
                System.out.println(TYPE + " ALREADY OFF!");
            } else {
                this.state = false;
                System.out.println(TYPE + " TURNED OFF!");
            }
        }
    }

}
