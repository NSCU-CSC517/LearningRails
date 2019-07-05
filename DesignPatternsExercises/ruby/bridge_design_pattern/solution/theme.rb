class Theme
  # attr_accessor __________(7)__________, :font_color
  attr_accessor :background_color, :font_color

  # def __________(8)__________(background_color, font_color)
  def initialize(background_color, font_color)
    @background_color = background_color
    @font_color = font_color
  end
end
