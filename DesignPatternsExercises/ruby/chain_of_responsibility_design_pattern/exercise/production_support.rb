require_relative 'support_chain'

class ProductionSupport < SupportChain
  def handle_issue(issue_type)
    if issue_type == :production
      puts 'Production support team will contact you shortly'
    else
      @next_support_link.__________(3)__________(issue_type)
    end
  end
end
