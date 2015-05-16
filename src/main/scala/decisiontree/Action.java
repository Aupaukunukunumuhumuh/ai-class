package decisiontree;

/**
 * Created by azranel on 16.05.15.
 */
public enum Action {
    GET_FUEL(0.0),
    COLLECT_GARBAGE(1.0),
    COLLECT_GENERAL(2.0),
    COLLECT_WASTEPAPER(3.0),
    COLLECT_GLASS(4.0),
    COLLECT_PLASTIC(5.0),
    RETURN_GARBAGE(6.0);

    public double getValue() {
        return value;
    }

    private double value;

    Action(double v) {
        this.value = v;
    }

    static Action actionForValue(double value) {
        if(value<0.0 && value>6.0)
            throw new IllegalArgumentException("value is out of range (" + String.valueOf(value) + ")");
        Action action = null;
        int val = (int) value;

        switch (val) {
            case 0: action = Action.GET_FUEL; break;
            case 1: action = Action.COLLECT_GARBAGE; break;
            case 2: action = Action.COLLECT_GENERAL; break;
            case 3: action = Action.COLLECT_WASTEPAPER; break;
            case 4: action = Action.COLLECT_GLASS; break;
            case 5: action = Action.COLLECT_PLASTIC; break;
            case 6: action = Action.RETURN_GARBAGE; break;
        }
        return action;
    }

}
