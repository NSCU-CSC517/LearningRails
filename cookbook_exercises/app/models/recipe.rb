class Recipe < ActiveRecord::Base
  before_save{self.description = description.downcase}
  #attr_accessible :description, :instructions, :title, :category_id
  belongs_to :category
  belongs_to :user
  #attr_accessor :title,:description,:instructions
  validates :title, :presence => true
  validates :description, :presence => true
  validates :instructions, :presence => true
  validates :user_id, presence: true
  #validates :category_id, :presence => true
end
