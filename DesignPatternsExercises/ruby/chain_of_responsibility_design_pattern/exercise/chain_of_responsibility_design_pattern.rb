require_relative 'configuration_support'
require_relative 'general_support'
require_relative 'production_support'

general_support = GeneralSupport.new
configuration_support = ConfigurationSupport.new
production_support = ProductionSupport.new

general_support.next(configuration_support)
configuration_support.next(production_support)

general_support.handle_issue(:production)
