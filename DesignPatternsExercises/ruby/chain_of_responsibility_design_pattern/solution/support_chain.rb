# class __________(4)__________
class SupportChain
  # def __________(5)__________(chain)
  def next(chain)
    # __________(6)__________ = chain
    @next_support_link = chain
  end

  def handle_issue(issue_type)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
