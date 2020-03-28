<?php
function createMsg($name)
{
    $msg = <<< EOM
    {$name}様
    お世話になっております。\n
    EOM;
    echo $msg;
}
createMsg("佐藤");
