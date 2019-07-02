enum IssueType { Configuration, General, Production }

public class ChainOfResponsibilityDesignPattern {
	public static void main(String[] args) {
		SupportChain generalSupport = new GeneralSupport();
		SupportChain configurationSupport = new ConfigurationSupport();
		SupportChain productionSupport = new ProductionSupport();

		// generalSupport.__________(1)__________(configurationSupport);
		generalSupport.setNext(configurationSupport);
		// configurationSupport.__________(2)__________(productionSupport);
		configurationSupport.setNext(productionSupport);

		generalSupport.handleIssue(IssueType.Production);
	}
}
