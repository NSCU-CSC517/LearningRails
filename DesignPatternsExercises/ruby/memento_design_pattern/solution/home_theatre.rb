require_relative 'memento'

class HomeTheatre
  @@state_count = 0

  def initialize(led_tv, speaker)
    @led_tv = led_tv
    @speaker = speaker
    # __________(1)__________ += 1
    @@state_count += 1
  end

  # def __________(2)__________
  def self.state_count
    @@state_count
  end

  def memento
    # __________(3)__________(@led_tv, @speaker)
    Memento.new(@led_tv, @speaker)
  end

  def memento=(memento)
    # @led_tv = __________(4)__________
    @led_tv = memento.led_tv
    # @speaker = __________(5)__________
    @speaker = memento.speaker
  end

  def to_string
    "#{@led_tv.to_string}\n    #{@speaker.to_string}"
  end
end
