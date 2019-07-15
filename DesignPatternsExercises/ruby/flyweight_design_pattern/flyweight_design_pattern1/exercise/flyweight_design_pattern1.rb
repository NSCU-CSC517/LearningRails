require_relative 'tree_selector'

tree_list = []

3.times do |depth|
  oak_tree = TreeSelector.tree('Oak Tree')
  oak_tree.root_depth = depth
  tree_list << oak_tree
end

3.times do
  flowering_cherry = TreeSelector.tree('Flowering Cherry')
  tree_list << flowering_cherry
end

tree_list.each { |tree| puts tree.to_string }

puts "\nChanging property of a single Tree instance from the list at index 0"
tree_list[0].change_property

tree_list.each { |tree| puts tree.to_string }
