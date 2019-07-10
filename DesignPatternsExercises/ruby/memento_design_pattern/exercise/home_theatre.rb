require_relative 'memento'

class HomeTheatre
  @@state_count = 0

  def initialize(led_tv, speaker)
    @led_tv = led_tv
    @speaker = speaker
    __________(1)__________ += 1
  end

  def __________(2)__________
    @@state_count
  end

  def memento
    __________(3)__________(@led_tv, @speaker)
  end

  def memento=(memento)
    @led_tv = __________(4)__________
    @speaker = __________(5)__________
  end

  def to_string
    "#{@led_tv.to_string}\n    #{@speaker.to_string}"
  end
end
