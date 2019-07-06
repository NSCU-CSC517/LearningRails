require_relative 'support_chain'

class ConfigurationSupport < SupportChain
  def handle_issue(issue_type)
    if issue_type == :configuration
      puts 'Configuration support team will contact you shortly'
    else
      # @next_support_link.__________(1)__________(issue_type)
      @next_support_link.handle_issue(issue_type)
    end
  end
end
