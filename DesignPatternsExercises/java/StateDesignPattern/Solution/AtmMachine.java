public class AtmMachine implements AtmMachineState {
    // private final AtmMachineState cardInsertedState = new __________(1)__________();
    private final AtmMachineState cardInsertedState = new CardInsertedState();
    private final AtmMachineState cardEjectedState = new CardEjectedState();
    private AtmMachineState atmMachineState;

    public AtmMachine() {
        atmMachineState = cardEjectedState;
    }

    // public String __________(2)__________() {
    public String getAtmMachineState() {
        return atmMachineState.getClass().getName();
    }

    @Override
    public boolean insertCard() {
        // if (atmMachineState.__________(3)__________()) {
        if (atmMachineState.insertCard()) {
            atmMachineState = cardInsertedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean ejectCard() {
        // if (atmMachineState.__________(4)__________()) {
        if (atmMachineState.ejectCard()) {
            atmMachineState = cardEjectedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw() {
        // if (atmMachineState.__________(5)__________()) {
        if (atmMachineState.withdraw()) {
            return true;
        }
        return false;
    }
}
