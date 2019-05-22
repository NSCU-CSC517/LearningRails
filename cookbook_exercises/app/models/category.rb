class Category < ActiveRecord::Base
  #attr_accessible :name
  has_many :recipes, dependent: :destroy

  #attr_accessor :name
  validates :name, :presence => true, uniqueness: { case_sensitive: false }, length: { maximum: 20}
end
