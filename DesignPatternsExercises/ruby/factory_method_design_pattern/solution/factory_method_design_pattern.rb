require_relative 'post_code_factory'

in_post_code = PostCodeFactory.instance(:IN, '576222')
puts in_post_code.post_code
puts ''

uk_post_code = PostCodeFactory.instance(:UK, 'SW15 5PU')
puts uk_post_code.post_code
puts ''

us_post_code = PostCodeFactory.instance(:US, '27606')
puts us_post_code.post_code
