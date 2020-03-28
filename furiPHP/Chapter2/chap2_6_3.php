<?php
var_dump("数値を入力せよ");
$msg = trim(fgets(STDIN));
if (!is_numeric($msg)) {
    var_dump("数値ではない");
}
