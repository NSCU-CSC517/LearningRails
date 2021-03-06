enum IssueType { Configuration, General, Production }

public class ChainOfResponsibilityDesignPattern {
	public static void main(String[] args) {
		SupportChain generalSupport = new GeneralSupport();
		SupportChain configurationSupport = new ConfigurationSupport();
		SupportChain productionSupport = new ProductionSupport();

		generalSupport.setNext(configurationSupport);
		configurationSupport.setNext(productionSupport);

		generalSupport.handleIssue(IssueType.Production);
	}
}
