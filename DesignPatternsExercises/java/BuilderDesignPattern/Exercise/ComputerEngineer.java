public class ComputerEngineer {
    private ComputerBuilder computerBuilder;

    public ComputerEngineer() {
        computerBuilder = __________(6)__________();
    }

    public Computer buildComputer() {
        return computerBuilder.__________(7)__________();
    }

    public PCBuilder getComputerBuilder() {
        return computerBuilder;
    }
}
