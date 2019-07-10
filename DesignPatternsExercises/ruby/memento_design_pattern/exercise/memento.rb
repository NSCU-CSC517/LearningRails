class Memento
  attr_reader :led_tv, :speaker

  def initialize(led_tv, speaker)
    @led_tv = led_tv
    @speaker = speaker
  end
end
