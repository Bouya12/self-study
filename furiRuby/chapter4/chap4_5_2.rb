# frozen_string_literal: true

class BillRecode
  attr_accessor :name, :bill
end

data = BillRecode.new
data.name = '山本'
data.bill = 40_000
puts data.name, data.bill
