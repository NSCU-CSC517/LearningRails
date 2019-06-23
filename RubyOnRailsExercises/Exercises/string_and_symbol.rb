# Which of the following expressions are equal to %q{abc}?

puts 'Which of the following expressions are equal to %q{abc}?'

puts '\'abc\'.to_sym'

puts ':abc'

puts '%Q{abc}'

puts ':abc.to_s'

puts '"#{:abc}"'
