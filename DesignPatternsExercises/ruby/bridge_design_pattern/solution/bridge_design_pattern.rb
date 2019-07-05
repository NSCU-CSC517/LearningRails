require_relative 'dark_theme'
require_relative 'light_theme'
require_relative 'editor'
require_relative 'terminal'

dark_theme =  DarkTheme.new
light_theme = LightTheme.new

editor = Editor.new
editor.theme = dark_theme
puts "Editor: Applying theme with background color #{editor.theme.background_color} and font color #{editor.theme.font_color}"

terminal = Terminal.new
terminal.theme = light_theme
puts "Terminal: Applying theme with background color #{terminal.theme.background_color} and font color #{terminal.theme.font_color}"
