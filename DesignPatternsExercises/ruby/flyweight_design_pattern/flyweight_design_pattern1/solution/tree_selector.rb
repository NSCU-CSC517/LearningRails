require_relative 'oak_tree'
require_relative 'flowering_cherry'

class TreeSelector
  # __________(9)__________ = {}
  @@tree_map = {}

  # def __________(10)__________(tree_type)
  def self.tree(tree_type)
    return @@tree_map.fetch(tree_type) if @@tree_map.key? tree_type

    # tree = __________(11)__________ if tree_type == 'Oak Tree'
    tree = OakTree.new if tree_type == 'Oak Tree'
    # tree = __________(12)__________ if tree_type == 'Flowering Cherry'
    tree = FloweringCherry.new if tree_type == 'Flowering Cherry'
    raise "#{tree_type} is not found" if tree.nil?

    @@tree_map[tree_type] = tree
    tree
  end
end
