package state;

/**
 * Created by Rafael on 2016-11-02.
 */
public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state = soldOutState;

    private int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    void refill(int count) {
        this.count = count;
        state = noQuarterState;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder()
                .append("\nMighty Gumball, Inc.")
                .append("\nJava-enabled Standing Gumball Model #2004")
                .append("\nInventory: ").append(count).append(" gumball")
                .append(count > 1 ? "s" : "");

        return result.toString();
    }
}
