// public __________(4)__________ class __________(5)__________ {
public abstract class SupportChain {
	protected SupportChain nextSupportLink;

	// public void __________(6)__________(SupportChain nextSupportLink) {
	public void setNext(SupportChain nextSupportLink) {
		this.nextSupportLink = nextSupportLink;
	}

	// public __________(7)__________ void __________(8)__________(IssueType issueType);
	public abstract void handleIssue(IssueType issueType);
}
