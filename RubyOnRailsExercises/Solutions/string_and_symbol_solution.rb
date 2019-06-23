# Which of the following expressions are equal to %q{abc}?

puts 'Which of the following expressions are equal to %q{abc}?'

print '\'abc\'.to_sym - '
puts %q{abc} == 'abc'.to_sym

print ':abc - '
puts %q{abc} == :abc

print '%Q{abc} - '
puts %q{abc} == %Q{abc}

print ':abc.to_s - '
puts %q{abc} == :abc.to_s

print '"#{:abc}" - '
puts %q{abc} == "#{:abc}"
