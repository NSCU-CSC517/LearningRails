require_relative 'db_extraction'
require_relative 'csv_extraction'
require_relative 'tsv_extraction'

class ExtractingTool

  def extraction(extraction)
    # @extraction = ________(1)__________
    @extraction = extraction
  end

  def start_extraction
    # ________(2)__________.call_correct_extraction
    @extraction.call_correct_extraction
  end
end

extracting_tool = ExtractingTool.new
# extracting_tool.extraction(________(3)__________)
extracting_tool.extraction(CSVExtraction.new('a.csv'))
extracting_tool.start_extraction

# extracting_tool.extraction(________(4)_________)
extracting_tool.extraction(TSVExtraction.new('b.tsv'))
extracting_tool.start_extraction

# extracting_tool.extraction(_________(5)_________)
extracting_tool.extraction(DBExtraction.new('c.db'))
extracting_tool.start_extraction
