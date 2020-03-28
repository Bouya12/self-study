<?php
var_dump("年齢は？");
$age = trim(fgets(STDIN));
if ($age < 20) {
    var_dump("未成年");
}
