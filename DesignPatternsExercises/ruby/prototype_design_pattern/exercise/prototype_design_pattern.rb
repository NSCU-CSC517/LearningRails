require_relative 'car'
require_relative 'prototype_factory'

original_car = Car.new(:Toyota)
cloned_car = PrototypeFactory.instance(original_car)
cloned_car.model = :Honda

puts "\nOriginal Car:"
original_car.print_details
puts "\nCloned Car:"
cloned_car.print_details
