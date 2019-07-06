public class ConfigurationSupport extends SupportChain {
	@Override
	public void handleIssue(IssueType issueType) {
		if(issueType == IssueType.Configuration) {
			System.out.println("Configuration support team will contact you shortly");
		} else {
			__________(1)__________.handleIssue(issueType);
		}
	}
}
