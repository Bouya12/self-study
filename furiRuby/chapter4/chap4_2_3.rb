# frozen_string_literal: true

def create_mail(recv)
  puts recv + '様'
  puts 'RB企画の斎藤です。'
  puts '今月の請求書を送ります。'
end

create_mail '山本'
create_mail '吉田'
