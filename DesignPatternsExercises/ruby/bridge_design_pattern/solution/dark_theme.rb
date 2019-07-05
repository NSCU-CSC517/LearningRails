require_relative 'theme'

# class DarkTheme < __________(1)__________
class DarkTheme < Theme
  def initialize
    # __________(2)__________('#000', '#FFFF')
    super('#000', '#FFFF')
  end
end
