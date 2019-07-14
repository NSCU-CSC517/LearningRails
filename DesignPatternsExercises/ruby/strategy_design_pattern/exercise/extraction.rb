class Extraction
  def extract
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def open
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def close
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
