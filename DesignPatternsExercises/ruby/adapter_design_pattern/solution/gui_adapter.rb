require_relative 'windows_gui'
require_relative 'mac_gui'
require_relative 'linux_gui'

class GUIAdapter
  # def __________(1)__________(operating_system)
  def initialize(operating_system)
    if operating_system.include? 'linux'
      # @os_gui = __________(2)__________
      @os_gui = LinuxGUI.new
      @display = 'display_linux'
    elsif operating_system.include? 'mac'
      @os_gui = MacGUI.new
      @display = 'display_mac'
    elsif operating_system.include? 'windows'
      @os_gui = WindowsGUI.new
      @display = 'display_windows'
    end
  end

  def display
    # @os_gui.send(__________(3)__________)
    @os_gui.send(@display)
  end
end
