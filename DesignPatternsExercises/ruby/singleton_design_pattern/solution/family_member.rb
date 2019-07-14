require_relative 'balance'

class FamilyMember
  def initialize(name)
    @name = name
    # @balance = Balance.__________(7)__________
    @balance = Balance.instance
  end

  def withdraw(amount)
    # __________(8)__________(amount)
    @balance.withdraw(amount)
  end

  def deposit(amount)
    # __________(9)__________(amount)
    @balance.deposit(amount)
  end

  def balance
    # __________(10)__________
    @balance.balance
  end
end
