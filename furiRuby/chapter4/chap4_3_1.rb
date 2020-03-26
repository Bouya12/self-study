# frozen_string_literal: true

def add_charge(bill)
  (bill * 1.07).to_i
end

puts add_charge(40_000)
