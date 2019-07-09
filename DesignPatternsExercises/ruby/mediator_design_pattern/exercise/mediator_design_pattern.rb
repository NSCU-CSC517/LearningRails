require_relative 'mediator'
require_relative 'seller'
require_relative 'buyer'

mediator = Mediator.new
Seller.new(:eurSeller, mediator, :USD, 100)
Seller.new(:gbpSeller1, mediator, :GBP, 50)
Seller.new(:gbpSeller2, mediator, :GBP, 100)
Seller.new(:inrSeller1, mediator, :INR, 100)
Seller.new(:inrSeller2, mediator, :INR, 200)

gbp_buyer = Buyer.new(mediator, :GBP)
gbp_buyer.attempt_to_purchase(79)
puts ''
gbp_buyer.attempt_to_purchase(79)
puts ''
inr_buyer = Buyer.new(mediator, :INR)
inr_buyer.attempt_to_purchase(20_000)
puts ''
rus_buyer = Buyer.new(mediator, :RUS)
rus_buyer.attempt_to_purchase(1)
