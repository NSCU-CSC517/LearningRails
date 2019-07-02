// public class ProductionSupport extends __________(10)__________ {
public class ProductionSupport extends SupportChain {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.Production) {
			System.out.println("Production support team will contact you shortly");
		} else {
			// __________(11)__________(issueType);
			nextSupportLink.handleIssue(issueType);
		}
	}
}
