require_relative 'extraction'

class CSVExtraction < Extraction
  def extract
    # __________(2)__________
    open
    puts 'CSV Data type is getting extracted by separating row by commas...'
    # __________(3)__________
    close
  end

  def open
    puts 'Opening CSV file...'
  end

  def close
    puts 'Closing CSV file...'
  end
end
