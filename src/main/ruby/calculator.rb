require 'java'

class Calculator
  include Java::Jrubyguice::Calculator

  def plus first, second
    first + second
  end
end
