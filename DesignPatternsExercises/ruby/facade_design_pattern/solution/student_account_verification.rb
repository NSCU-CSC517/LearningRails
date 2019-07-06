class StudentAccountVerification
  def initialize
    @student_id_list = [2000, 2001, 2002, 2003, 2005, 2010]
  end

  # def __________(7)__________(student_id)
  def student_id_valid?(student_id)
    return true if @student_id_list.include? student_id

    puts "Student ID #{student_id} is invalid"
    false
  end
end
