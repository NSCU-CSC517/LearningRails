// public class ComputerBuilder __________(3)__________ PCBuilder {
public class ComputerBuilder extends PCBuilder {
    @Override
    public PCBuilder addMouse(String type) {
        // Mouse mouse = __________(4)__________(type);
        Mouse mouse = new Mouse(type);
        computer.addMouse(mouse);
        // __________(5)__________;
        return this;
    }
}
