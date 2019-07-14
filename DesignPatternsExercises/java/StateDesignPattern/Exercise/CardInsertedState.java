public class CardInsertedState implements AtmMachineStates {
    @Override
    public boolean ejectCard() {
        System.out.println("Card is ejected...");
        return true;
    }

    @Override
    public boolean insertCard() {
        System.out.println("Card is already inserted into ATM Machine slot...");
        return false;
    }

    @Override
    public boolean withdraw() {
        System.out.println("Money are withdrawn...");
        return true;
    }
}
