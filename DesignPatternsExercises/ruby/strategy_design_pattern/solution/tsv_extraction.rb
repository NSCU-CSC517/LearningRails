require_relative 'extraction'

class TSVExtraction < Extraction
  def extract
    # __________(8)__________
    open
    puts 'TSV Data type is getting extracted by separating row by tabs...'
    # __________(9)__________
    close
  end

  def open
    puts 'Opening TSV file...'
  end

  def close
    puts 'Closing TSV file...'
  end
end
