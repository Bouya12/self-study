# frozen_string_literal: true

class BillRecode
  attr_accessor :name, :bill
  def bill_with_charge
    (@bill * 1.07).to_i
  end
end

data = BillRecode.new
data.name = '山本'
data.bill = 40_000
puts data.name, data.bill_with_charge
