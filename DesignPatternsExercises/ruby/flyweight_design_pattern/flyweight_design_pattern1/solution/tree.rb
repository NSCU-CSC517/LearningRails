class Tree
  attr_reader :has_flowers, :has_fruits, :height

  def initialize(has_flowers, has_fruits, height)
    @has_flowers = has_flowers
    @has_fruits = has_fruits
    @height = height
  end

  def change_property
    raise NotImplementedError, 'Subclasses must override this method'
  end

  def to_string
    raise NotImplementedError, 'Subclasses must override this method'
  end
end
