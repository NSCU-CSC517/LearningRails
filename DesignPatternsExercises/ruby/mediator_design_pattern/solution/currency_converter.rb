class CurrencyConverter
  # __________(3)__________ = { USD: 1, EUR: 0.9378, GBP: 0.7974, INR: 64.54 }
  @@conversion_to_dollar_rates = { USD: 1, EUR: 0.9378, GBP: 0.7974, INR: 64.54 }

  # def __________(4)__________.convert(currency, amount)
  def self.convert(currency, amount)
    amount / @@conversion_to_dollar_rates[currency]
  end
end
