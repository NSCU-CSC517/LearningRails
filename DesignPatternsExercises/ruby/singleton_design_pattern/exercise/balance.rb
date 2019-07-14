class Balance
  attr_reader __________(1)__________

  def __________(2)__________(balance)
    @balance = balance
    __________(3)__________ = nil
  end

  def __________(4)__________.instance
    @first_instance = __________(5)__________(100) if @first_instance.nil?
    __________(6)__________
  end

  def withdraw(amount)
    @balance > amount ? (@balance -= amount) : (puts 'Insufficient balance')
  end

  def deposit(amount)
    @balance += amount
  end
end
