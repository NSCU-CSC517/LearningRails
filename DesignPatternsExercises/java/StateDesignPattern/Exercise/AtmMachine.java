public class AtmMachine implements AtmMachineState {
    private final AtmMachineState cardInsertedState = new __________(1)__________();
    private final AtmMachineState cardEjectedState = new CardEjectedState();
    private AtmMachineState atmMachineState;

    public AtmMachine() {
        atmMachineState = cardEjectedState;
    }

    public String __________(2)__________() {
        return atmMachineState.getClass().getName();
    }

    @Override
    public boolean insertCard() {
        if (atmMachineState.__________(3)__________()) {
            atmMachineState = cardInsertedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean ejectCard() {
        if (atmMachineState.__________(4)__________()) {
            atmMachineState = cardEjectedState;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw() {
        if (atmMachineState.__________(5)__________()) {
            return true;
        }
        return false;
    }
}
