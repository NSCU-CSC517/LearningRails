class PrototypeFactory
  # def __________(3)__________(cloneable_object)
  def self.instance(cloneable_object)
    puts "Cloning #{cloneable_object.class} object..."
    # __________(4)__________.clone
    cloneable_object.clone
  end
end
