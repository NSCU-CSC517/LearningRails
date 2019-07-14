class Balance
  # attr_reader __________(1)__________
  attr_reader :balance

  # def __________(2)__________(balance)
  def initialize(balance)
    @balance = balance
    # __________(3)__________ = nil
    @first_instance = nil
  end

  # def __________(4)__________.instance
  def self.instance
    # @first_instance = __________(5)__________(100) if @first_instance.nil?
    @first_instance = Balance.new(100) if @first_instance.nil?
    # __________(6)__________
    @first_instance
  end

  def withdraw(amount)
    @balance > amount ? (@balance -= amount) : (puts 'Insufficient balance')
  end

  def deposit(amount)
    @balance += amount
  end
end
