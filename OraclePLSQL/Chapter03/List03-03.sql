DECLARE
  var NUMBER := 20;
BEGIN
  IF var = 10 THEN
    DBMS_OUTPUT.PUT_LINE('Value is 10');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Value is not 10');
  END IF;
END;
/