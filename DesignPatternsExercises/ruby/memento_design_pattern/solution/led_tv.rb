class LedTV
  def initialize(size, price)
    # __________(6)__________ = size
    @led_tv = size
    # __________(7)__________ = price
    @speaker = price
  end

  def to_string
    "Led TV:\n        size: #{@led_tv}, price: $#{@speaker}"
  end
end
