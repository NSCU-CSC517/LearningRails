require_relative 'extraction'
require_relative 'db_extractor'

class DBExtraction < Extraction
  def call_correct_extraction
    # __________(7)__________
    DBExtractor.new.extract
  end
end
