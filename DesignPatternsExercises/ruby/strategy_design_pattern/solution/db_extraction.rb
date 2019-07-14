require_relative 'extraction'

class DBExtraction < Extraction
  def extract
    # __________(5)__________
    open
    puts 'DB Data type is getting extracted by reading rows and columns...'
    # __________(6)__________
    close
  end

  def open
    puts 'Opening DB file...'
  end

  def close
    puts 'Closing DB file...'
  end
end
