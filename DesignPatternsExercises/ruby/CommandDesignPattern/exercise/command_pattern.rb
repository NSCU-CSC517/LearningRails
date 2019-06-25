require_relative 'db_extraction'
require_relative 'csv_extraction'
require_relative 'tsv_extraction'

class ExtractingTool

  def extraction(extraction)
    @extraction = __________(1)__________
  end

  def start_extraction
    __________(2)__________.call_correct_extraction
  end
end

extracting_tool = ExtractingTool.new
extracting_tool.extraction(__________(3)__________)
extracting_tool.start_extraction

extracting_tool.extraction(__________(4)__________)
extracting_tool.start_extraction

extracting_tool.extraction(__________(5)__________)
extracting_tool.start_extraction
