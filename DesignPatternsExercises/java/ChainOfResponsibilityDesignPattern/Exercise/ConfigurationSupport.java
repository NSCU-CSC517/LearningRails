public class ConfigurationSupport extends __________(6)__________ {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.Configuration) {
			System.out.println("Configuration support team will contact you shortly");
		} else {
			__________(7)__________(issueType);
		}
	}
}
