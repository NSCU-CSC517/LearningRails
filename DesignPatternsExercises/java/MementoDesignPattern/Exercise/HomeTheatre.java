public class HomeTheatre {
	private LedTV ledTV;
	private Speaker speaker;
	private static int stateCount = 0;

	public HomeTheatre(LedTV ledTV, Speaker speaker) {
		this.ledTV = ledTV;
		this.speaker = speaker;
		__________(1)__________++;
	}

	public Memento createMemento() {
		return __________(2)__________(ledTV, speaker);
	}

	public void setMemento(Memento memento) {
		ledTV = memento.__________(3)__________();
		speaker = memento.__________(4)__________();
	}

	public static int getStateCount() {
		return stateCount;
	}

	@Override
    public String toString() {
		return ledTV + "\n    " + speaker;
    }
}
