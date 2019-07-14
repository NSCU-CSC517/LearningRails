class Travel
  # def __________(7)__________
  def template_travel
    puts 'Template travel information:'
    dates
    destination
    use_private_vehicle unless use_public_transport?
    meal if meal_available?
    book_ticket if use_public_transport?
    display_travel_details
  end

  def dates
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def destination
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def meal
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def use_private_vehicle
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def book_ticket
    raise NotImplementedError, 'Subclasses must override this method'
  end

  # def __________(8)__________
  def display_travel_details
    puts ' Travel has been confirmed.'
    puts "    Start Date: #{@start_date}"
    puts "    End Date: #{@end_date}"
    puts "    Destination: #{@destination}"
  end

  def use_public_transport?
    true
  end

  # def __________(9)__________
  def meal_available?
    false
  end
end
