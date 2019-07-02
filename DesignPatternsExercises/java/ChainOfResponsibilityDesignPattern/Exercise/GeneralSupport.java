public class GeneralSupport extends __________(8)__________ {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.General) {
			System.out.println("General support team will contact you shortly");
		} else {
			__________(9)__________(issueType);
		}
	}
}
