public abstract class SupportChain {
	// protected __________(3)__________ nextSupportLink;
	protected SupportChain nextSupportLink;

	public void setNext(SupportChain nextSupportLink) {
		this.nextSupportLink = nextSupportLink;
	}

	// public __________(4)__________ void __________(5)__________(IssueType issueType);
	public abstract void handleIssue(IssueType issueType);
}
