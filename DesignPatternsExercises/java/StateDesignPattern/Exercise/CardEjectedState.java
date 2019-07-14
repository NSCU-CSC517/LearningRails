public class CardEjectedState implements AtmMachineStates {
    @Override
    public boolean ejectCard() {
        System.out.println("No card in ATM Machine slot, unable to eject the card...");
        return false;
    }

    @Override
    public boolean insertCard() {
        System.out.println("Card is inserted...");
        return true;
    }

    @Override
    public boolean withdraw() {
        System.out.println("No card in ATM Machine slot, unable to withdraw...");
        return false;
    }
}
