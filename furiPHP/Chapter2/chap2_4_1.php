<?php
var_dump("年齢は？");
$age = trim(fgets(STDIN));
if ($age < 20) {
    var_dump("未成年");
} else {
    var_dump("成人");
}
