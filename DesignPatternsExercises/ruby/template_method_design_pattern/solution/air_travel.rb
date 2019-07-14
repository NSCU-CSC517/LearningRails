require_relative 'travel'

# class AirTravel < __________(1)__________
class AirTravel < Travel
  def dates
    puts 'Setting dates...'
    @start_date = '07/04/2019'
    @end_date = '08/10/2019'
  end

  def destination
    puts 'Setting destination...'
    @destination = 'Tokyo, Japan'
  end

  def meal
    puts 'Selecting meal...'
    @meal = 'Asian Vegetarian'
  end

  def use_private_vehicle
  end

  def book_ticket
    puts 'Booking ticket...'
    @booked = true
  end

  def display_travel_details
    print 'Air Travel:'
    if @booked
      # __________(2)__________
      super
      puts "    Meal selected: #{@meal}" unless @meal.nil?
    else
      puts ' Transaction cancelled'
    end
    puts
  end

  def meal_available?
    true
  end
end
