def valid_date(date)
  # if date =~ /^(__________(1)__________)-(__________(2)__________)-(__________(3)__________)$/
  if date =~ /^(\w{4})-(\w{2})-(\w{2})$/
    # $1 captures the year, $2 captures the month and $3 captures the day of entered date

    # return false if (__________(4)__________) && ($2 == '04' || $2 == '06' || $2 == '09' || $2 == '11')
    return false if ($3 == '31') && ($2 == '04' || $2 == '06' || $2 == '09' || $2 == '11')
    # It will return false if Feb, Jun, Sep, or Nov has 31st

    # return false if ($2 == "02") && (__________(5)__________)
    return false if ($2 == '02') && ($3.to_i > 28)
    # It will return false if Feb has more than 28 days

    return true
  end
  false
end

puts valid_date('2011-02-28')