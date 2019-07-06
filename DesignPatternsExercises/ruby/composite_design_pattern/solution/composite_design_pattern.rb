require_relative 'block'
require_relative 'group'
require_relative 'structure'

block1 = Block.new(1, 2)
block2 = Block.new(3, 4)
block3 = Block.new(5, 6)

parent_structure = Structure.new(:parent)
child_structure1 = Structure.new(:child1)
child_structure2 = Structure.new(:child2)

child_structure1.add(block1)
child_structure1.add(block2)
child_structure2.add(block3)

parent_structure.add(child_structure1)
parent_structure.add(child_structure2)

# parent_structure.__________(1)__________
parent_structure.assemble
