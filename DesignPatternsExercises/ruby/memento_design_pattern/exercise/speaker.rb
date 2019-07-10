class Speaker
  def initialize(wattage)
    @wattage = wattage
  end

  def to_string
    "Speaker:\n        wattage: #{@wattage}"
  end
end
