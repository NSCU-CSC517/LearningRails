public class AtmMachine implements AtmMachineStates {
    // private final AtmMachineStates cardEjectedState = __________(1)__________();
    private final AtmMachineStates cardEjectedState = new CardEjectedState();
    private final AtmMachineStates cardInsertedState = new CardInsertedState();
    private AtmMachineStates atmMachineState;

    public AtmMachine() {
        // __________(2)__________ = cardEjectedState;
        atmMachineState = cardEjectedState;
    }

    // public String __________(3)__________() {
    public String getAtmMachineState() {
        return atmMachineState.getClass().getName();
    }

    @Override
    public boolean ejectCard() {
        // if (__________(4)__________()) {
        if (atmMachineState.ejectCard()) {
            atmMachineState = cardEjectedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean insertCard() {
        // if (__________(5)__________()) {
        if (atmMachineState.insertCard()) {
            atmMachineState = cardInsertedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw() {
        // return __________(6)__________();
        return atmMachineState.withdraw();
    }
}
