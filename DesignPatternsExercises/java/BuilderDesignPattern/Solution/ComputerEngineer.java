public class ComputerEngineer {
    private ComputerBuilder computerBuilder;

    public ComputerEngineer() {
        // computerBuilder = __________(6)__________();
        computerBuilder = new ComputerBuilder();
    }

    public Computer buildComputer() {
        // return computerBuilder.__________(7)__________();
        return computerBuilder.getComputer();
    }

    public PCBuilder getComputerBuilder() {
        return computerBuilder;
    }
}
