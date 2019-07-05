require_relative 'gui_adapter'

gui = GUIAdapter.new('linux')
gui.display

gui = GUIAdapter.new('mac')
gui.display

gui = GUIAdapter.new('windows')
gui.display
