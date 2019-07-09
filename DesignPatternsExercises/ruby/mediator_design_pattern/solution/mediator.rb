require_relative 'currency_converter'

class Mediator
  def initialize
    @buyer_list = []
    @seller_list = []
  end

  def add_seller(seller)
    @seller_list << seller
  end

  def add_buyer(buyer)
    @buyer_list << buyer
  end

  # def __________(5)__________(currency, bid)
  def place_bid(currency, bid)
    sellers = []
    @seller_list.each { |seller| sellers << seller if seller.currency == currency && seller.selling_price > 0 }

    if sellers.empty?
      puts "Seller is not found for #{bid} #{currency}"
    else
      # dollar_amount = CurrencyConverter.__________(6)__________(currency, bid)
      dollar_amount = CurrencyConverter.convert(currency, bid)
      sellers.each { |seller| return if seller.bid_accepted?(dollar_amount) }
    end
  end
end
