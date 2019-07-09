class Seller
  attr_reader :currency, :selling_price

  def initialize(name, mediator, currency, selling_price)
    @name = name
    @currency = currency
    @selling_price = selling_price
    # mediator.__________(7)__________
    mediator.add_seller(self)
  end

  # def __________(8)__________(bid_in_dollars)
  def bid_accepted?(bid_in_dollars)
    if bid_in_dollars <= selling_price
      puts "Seller #{@name} accepts the bid of USD #{bid_in_dollars}"
      @selling_price = 0
      true
    else
      puts"Seller #{@name} rejects the bid of USD #{bid_in_dollars}"
      false
    end
  end
end
