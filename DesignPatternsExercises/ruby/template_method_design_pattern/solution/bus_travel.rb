require_relative 'travel'

# class BusTravel <  __________(3)__________
class BusTravel < Travel
  def dates
    puts 'Setting dates...'
    @start_date = '09/05/2019'
    @end_date = '10/01/2019'
  end

  def destination
    puts 'Setting destination...'
    @destination = 'New York, NY, USA'
  end

  def meal
  end

  def use_private_vehicle
  end

  def book_ticket
    puts 'Booking ticket...'
  end

  def display_travel_details
    print 'Bus Travel:'
    # @booked ? __________(4)__________ : (puts ' Transaction cancelled')
    @booked ? super : (puts ' Transaction cancelled')
    puts
  end
end
