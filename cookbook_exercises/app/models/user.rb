class User < ActiveRecord::Base
  before_save {email.downcase! }
  has_secure_password
  has_many :recipes, dependent: :destroy
  EMAIL_REGEX = /\A([\w+\-].?)+@[a-z\d\-]+(\.[a-z]+)*\.[a-z]+\z/i
  validates :name, length: {minimum: 2, maximum: 20}, presence: true
  validates :email, uniqueness: { case_sensitive: false }, length: { maximum: 255 }, format: { with: EMAIL_REGEX }
  validates :password, length: {minimum: 6, maximum: 15}, presence: true
end
