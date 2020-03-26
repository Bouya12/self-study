# frozen_string_literal: true

puts '年齢は？'
age = gets.to_i
if age < 20
  puts '未成年'
elsif age < 65
  puts '成人'
else
  puts '高齢者'
end
