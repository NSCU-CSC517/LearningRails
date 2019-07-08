require_relative 'post_code'

class USPostCode < PostCode
  def initialize(post_code)
    __________(17)__________(post_code)
    puts "Creating instance of USPostCode: #{post_code}"
  end

  def __________(18)__________(post_code)
    post_code =~ /^[0-9]{5}(?:-[0-9]{4})?$/
  end
end
