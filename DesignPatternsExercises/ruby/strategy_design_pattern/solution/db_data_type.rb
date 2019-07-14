require_relative 'data_type'
require_relative 'db_extraction'

class DBDataType < DataType
  def extract_data
    # __________(4)__________.extract
    DBExtraction.new.extract
  end
end
