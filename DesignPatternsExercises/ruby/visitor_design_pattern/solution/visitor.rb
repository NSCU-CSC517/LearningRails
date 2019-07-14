class Visitor
  def visit(node)
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
