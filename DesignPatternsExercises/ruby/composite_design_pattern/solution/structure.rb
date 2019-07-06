require_relative 'group'

class Structure < Group
  def initialize(name)
    @name = name
    # __________(3)__________ = []
    @group_list = []
  end

  def assemble
    puts "Assembling \"#{@name}\" structure using its list of child Group objects"
    # @group_list.each(&__________(4)__________)
    @group_list.each(&:assemble)
    puts "Created \"#{@name}\" structure from its list of child Group objects"
  end

  # def __________(5)__________(group)
  def add(group)
    @group_list << group
  end

  def remove(group)
    @group_list.delete(group)
  end
end
