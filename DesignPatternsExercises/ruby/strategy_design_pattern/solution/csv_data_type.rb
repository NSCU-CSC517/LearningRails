require_relative 'data_type'
require_relative 'csv_extraction'

class CSVDataType < DataType
  def extract_data
    # __________(1)__________.extract
    CSVExtraction.new.extract
  end
end
