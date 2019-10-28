DECLARE
  var NUMBER  := 15;
BEGIN
  IF var < 10 THEN
    DBMS_OUTPUT.PUT_LINE('Values less than 10');
  ELSIF var < 20 THEN
    DBMS_OUTPUT.PUT_LINE('Values less than 20');
  ELSIF var < 30 THEN
    DBMS_OUTPUT.PUT_LINE('Values less than 30');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Other');
  END IF;
END;
/