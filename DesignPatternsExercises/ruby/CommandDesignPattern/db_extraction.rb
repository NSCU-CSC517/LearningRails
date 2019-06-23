require_relative 'extraction'
require_relative 'db_extractor'

class DBExtraction < Extraction

  attr_accessor :file

  def initialize(file)
    @file = file
  end

  def call_correct_extraction
    # _________(7)______________
    DBExtractor.new.extract
  end

end