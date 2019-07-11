require_relative 'abstract_factory'

phone_number_factory = AbstractFactory.factory(:Phone)
phone_number_uk = phone_number_factory.instance(:UK, '+44 7836 191 191')
phone_number_us = phone_number_factory.instance(:US, '(919) 515-2011')
puts phone_number_uk.phone_number
puts phone_number_us.phone_number
puts ''

post_code_factory = AbstractFactory.factory(:Post)
post_code_uk = post_code_factory.instance(:UK, 'SW15 5PU')
post_code_us = post_code_factory.instance(:US, '27606')
puts post_code_uk.post_code
puts post_code_us.post_code
