// public class GeneralSupport extends __________(8)__________ {
public class GeneralSupport extends SupportChain {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.General) {
			System.out.println("General support team will contact you shortly");
		} else {
			// __________(9)__________(issueType);
			nextSupportLink.handleIssue(issueType);
		}
	}
}
