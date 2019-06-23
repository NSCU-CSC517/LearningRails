require_relative 'extraction'
require_relative 'csv_extractor'

class CSVExtraction < Extraction

  attr_accessor :file

  def initialize(file)
    @file = file
  end

  def call_correct_extraction
    # _________(6)_________
    CSVExtractor.new.extract
  end

end