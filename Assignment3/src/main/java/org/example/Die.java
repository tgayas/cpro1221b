// Die class represents a single die with methods for rolling and getting its value
public class Die {
    private int value; // Variable to store the current value of the die


    // Constructor to initialize the die with a value of zero
    public Die() {
        value = 0;
    }
    // Method to simulate rolling the die and set its value
    public void roll() {
        value = (int) (Math.random() * 6) + 1;
    }

    // Method to get the current value of the die
    public int getValue() {
        return value;
    }
}
