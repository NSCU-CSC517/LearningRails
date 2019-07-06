require_relative 'support_chain'

class GeneralSupport < SupportChain
  def handle_issue(issue_type)
    if issue_type == :general
      puts 'General support team will contact you shortly'
    else
      @next_support_link.__________(2)__________(issue_type)
    end
  end
end
