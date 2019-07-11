class Extraction
  def __________(8)__________(file)
    @file = file
  end

  def call_correct_extraction
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
