require_relative 'extraction'
require_relative 'tsv_extractor'

class TSVExtraction < Extraction
  def call_correct_extraction
    # __________(9)__________
    TSVExtractor.new.extract
  end
end
