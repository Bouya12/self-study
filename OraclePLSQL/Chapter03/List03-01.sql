﻿DECLARE
  var NUMBER := 10;
BEGIN
  IF var = 10 THEN
    DBMS_OUTPUT.PUT_LINE('値は10');
  ELSE
    DBMS_OUTPUT.PUT_LINE('値は10以外');
  END IF;
END;
/