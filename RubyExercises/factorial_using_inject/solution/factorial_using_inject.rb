def factorial(n)
  # __________(1)__________
  (1..n).inject { |v, n| v * n }
end

puts factorial 5
