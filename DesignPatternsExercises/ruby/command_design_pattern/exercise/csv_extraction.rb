require_relative 'extraction'
require_relative 'csv_extractor'

class CSVExtraction < Extraction

  attr_accessor :file

  def initialize(file)
    @file = file
  end

  def call_correct_extraction
    __________(6)__________
  end

end
