require_relative 'db_extraction'
require_relative 'csv_extraction'
require_relative 'tsv_extraction'

class ExtractingTool

  def extraction(extraction)
    # @extraction = _________(1)_________
    @extraction = extraction
  end

  def start_extraction
    # _________(2)_________.call_correct_extraction
    @extraction.call_correct_extraction
  end
end

extracting_tool = ExtractingTool.new
# extracting_tool.extraction(_________(3)_________)
extracting_tool.extraction(CSVExtraction.new('a.csv'))
extracting_tool.start_extraction

# extracting_tool.extraction(_________(4)_________)
extracting_tool.extraction(TSVExtraction.new('b.tsv'))
extracting_tool.start_extraction

# extracting_tool.extraction(_________(5)_________)
extracting_tool.extraction(DBExtraction.new('c.db'))
extracting_tool.start_extraction
