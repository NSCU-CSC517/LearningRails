public class StateDesignPattern {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();

        System.out.println("ATM Machine current state: " + atmMachine.getAtmMachineState());
        atmMachine.withdraw();
        atmMachine.ejectCard();

        System.out.println("\nATM Machine current state: " + atmMachine.getAtmMachineState());
        atmMachine.insertCard();

        System.out.println("\nATM Machine current state: " + atmMachine.getAtmMachineState());
        atmMachine.withdraw();
        atmMachine.ejectCard();
    }
}
