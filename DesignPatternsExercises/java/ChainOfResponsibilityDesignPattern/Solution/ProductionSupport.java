public class ProductionSupport extends SupportChain {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.Production) {
			System.out.println("Production support team will contact you shortly");
		} else {
			// __________(3)__________.handleIssue(issueType);
			nextSupportLink.handleIssue(issueType);
		}
	}
}
