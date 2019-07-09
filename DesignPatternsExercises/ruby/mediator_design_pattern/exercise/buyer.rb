class Buyer
  def initialize(mediator, currency)
    @mediator = mediator
    @currency = currency
    mediator.__________(1)__________
  end

  def __________(2)__________(bid)
    puts "Buyer is attempting a bid of #{@currency} #{bid}"
    @mediator.place_bid(@currency, bid)
  end
end
