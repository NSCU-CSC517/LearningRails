require_relative 'country'
require 'set'

class CountrySet
  attr_reader :country_set

  def initialize
    __________(6)__________ = Set[Country.new('Japan', 700, 7000),
                       Country.new('Russia', 800, 8000),
                       Country.new('United States', 900, 9000)]
  end
end
