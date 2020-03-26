# frozen_string_literal: true

def add_charge(bill)
  return '負の数は計算できない' if bill.negative?

  (bill * 1.07).to_i
end

puts add_charge(40_000)
puts add_charge(-1000)
