require_relative 'book_availability.rb'
require_relative 'student_account_verification.rb'

class BookCheckoutFacade
  def initialize(student_id)
    @student_id = student_id
    # @student_account_verification = __________(4)__________
    @student_account_verification = StudentAccountVerification.new
    # @book_availability = __________(5)__________
    @book_availability = BookAvailability.new
  end

  def issue_book(book)
    # @book_availability.__________(6)__________(book) if
    @book_availability.book_checkout(book) if
        @student_account_verification.student_id_valid?(@student_id) && @book_availability.book_available?(book)
  end
end
