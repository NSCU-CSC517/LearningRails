class Student
  attr_reader :name
  @@university = 'NCSU'

  def initialize(name)
    @name = name
  end

  def self.show_identity
    puts 'Im a student'
  end

  private

  def private_method
  end

end

aStudent = Student.new('Ethan')

# puts aStudent__________(1)__________ #=> Student
puts aStudent.class #=> Student
# puts aStudent__________(2)__________ #=> Object
puts aStudent.class.superclass #=> Object
# puts aStudent__________(3)__________ #=> @name
puts aStudent.instance_variables #=> @name
# puts aStudent__________(4)__________ #=> name
puts aStudent.public_methods(false) #=> name
# puts aStudent__________(5)__________ #=> show_identity
puts aStudent.class.methods(false) #=> show_identity
# puts aStudent__________(6)__________ #=> @@university
puts aStudent.class.class_variables #=> @@university
# puts aStudent__________(7)__________ #=> Im a student
puts aStudent.class.show_identity #=> Im a student
# puts aStudent__________(8)__________ #=> private_method initialize
puts aStudent.class.private_instance_methods(false) #=> private_method initialize
