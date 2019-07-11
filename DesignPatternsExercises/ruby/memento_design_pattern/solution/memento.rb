class Memento
  # attr_reader __________(7)__________, :speaker
  attr_reader :led_tv, :speaker

  # def __________(8)__________(led_tv, speaker)
  def initialize(led_tv, speaker)
    @led_tv = led_tv
    @speaker = speaker
  end
end
