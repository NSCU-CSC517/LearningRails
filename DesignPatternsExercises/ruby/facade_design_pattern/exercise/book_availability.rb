class BookAvailability

  def __________(2)__________.create_book_map
    __________(3)__________ = { Constants::JAVA_BOOK => 1, Constants::DESIGN_BOOK => 3, Constants::MISTAKES_BOOK => 7 }
  end

  def book_available?(book)
    if (@@book_map.include? book) && (@@book_map[book] > 0)
      puts "#{book} is available"
      true
    else
      puts "Sorry, #{book} is not available"
      false
    end
  end

  def book_checkout(book)
    new_book_map = { book => @@book_map[book] - 1 }
    @@book_map.update(new_book_map)
    puts 'You have 2 days to return it'
  end
end
