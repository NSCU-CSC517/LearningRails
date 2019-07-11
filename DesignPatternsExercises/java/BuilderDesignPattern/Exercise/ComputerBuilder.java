public class ComputerBuilder __________(3)__________ PCBuilder {
    @Override
    public PCBuilder addMouse(String type) {
        Mouse mouse = __________(4)__________(type);
        computer.addMouse(mouse);
        __________(5)__________;
    }
}
