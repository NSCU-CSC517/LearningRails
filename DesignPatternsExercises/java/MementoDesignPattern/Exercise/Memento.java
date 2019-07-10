public class Memento {
    private final LedTV ledTV;
    private final Speaker speaker;

    public Memento(LedTV ledTV, Speaker speaker) {
        this.ledTV = ledTV;
        this.speaker = speaker;
    }

    public LedTV getLedTV() {
        return ledTV;
    }

    public Speaker getSpeaker() {
        return speaker;
    }
}
