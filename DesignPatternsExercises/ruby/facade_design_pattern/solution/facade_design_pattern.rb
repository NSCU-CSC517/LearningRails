require_relative 'book_checkout_facade.rb'

module Constants
  JAVA_BOOK = 'Java - The Complete Reference'.freeze
  DESIGN_BOOK = 'Design of Wood Structures'.freeze
  MISTAKES_BOOK = 'Three Mistakes of My Life'.freeze
end

class FacadeDesignPattern
  # BookAvailability.__________(1)__________
  BookAvailability.create_book_map

  puts "Student ID: 2001 and Book: #{Constants::JAVA_BOOK}"
  book_checkout_facade = BookCheckoutFacade.new(2001)
  book_checkout_facade.issue_book(Constants::JAVA_BOOK)
  puts ''

  puts "Student ID: 2002 and Book: #{Constants::JAVA_BOOK}"
  book_checkout_facade = BookCheckoutFacade.new(2002)
  book_checkout_facade.issue_book(Constants::JAVA_BOOK)
  puts ''

  puts "Student ID: 1 and Book: #{Constants::DESIGN_BOOK}"
  book_checkout_facade = BookCheckoutFacade.new(1)
  book_checkout_facade.issue_book(Constants::DESIGN_BOOK)
end
