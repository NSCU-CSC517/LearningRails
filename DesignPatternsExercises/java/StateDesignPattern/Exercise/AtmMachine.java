public class AtmMachine implements AtmMachineStates {
    private final AtmMachineStates cardEjectedState = __________(1)__________();
    private final AtmMachineStates cardInsertedState = new CardInsertedState();
    private AtmMachineStates atmMachineState;

    public AtmMachine() {
        __________(2)__________ = cardEjectedState;
    }

    public String __________(3)__________() {
        return atmMachineState.getClass().getName();
    }

    @Override
    public boolean ejectCard() {
        if (__________(4)__________()) {
            atmMachineState = cardEjectedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean insertCard() {
        if (__________(5)__________()) {
            atmMachineState = cardInsertedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw() {
        return __________(6)__________();
    }
}
