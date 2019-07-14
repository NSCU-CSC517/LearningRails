require_relative 'travel'

# class CarTravel < __________(5)__________
class CarTravel < Travel
  def dates
    puts 'Setting dates...'
    @start_date = '01/01/2020'
    @end_date = '01/10/2020'
  end

  def destination
    puts 'Setting destination...'
    @destination = 'Miami, FL, USA'
  end

  def meal
  end

  def use_private_vehicle
    puts 'Selecting vehicle...'
    @vehicle = 'Honda Freed'
  end

  def book_ticket
  end

  def display_travel_details
    print 'Car Travel:'
    # __________(6)__________
    super
    puts "    Vehicle selected: #{@vehicle}" unless @vehicle.nil?
    puts
  end

  def use_public_transport?
    false
  end
end
