require_relative 'theme'

# class LightTheme < __________(4)__________
class LightTheme < Theme
  def initialize
    # __________(5)__________('#FFF', '#000')
    super('#FFF', '#000')
  end
end
