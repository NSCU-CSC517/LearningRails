// public class ConfigurationSupport extends __________(6)__________ {
public class ConfigurationSupport extends SupportChain {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.Configuration) {
			System.out.println("Configuration support team will contact you shortly");
		} else {
			// __________(7)__________(issueType);
			nextSupportLink.handleIssue(issueType);
		}
	}
}
