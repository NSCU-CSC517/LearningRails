require_relative 'abstract_factory'

phone_factory = AbstractFactory.factory('Phone')
phone_factory.instance('UK', '+44 7836 191 191')
phone_factory.instance('US', '(919) 515-2011')

post_code_factory = AbstractFactory.factory('Post')
post_code_factory.instance('UK', 'SW15 5PU')
post_code_factory.instance('US', '27606')
