DECLARE
  var NUMBER  := 15;
BEGIN
  CASE
    WHEN var < 10 THEN
      DBMS_OUTPUT.PUT_LINE('Value less than 10');
    WHEN var < 20 THEN
      DBMS_OUTPUT.PUT_LINE('Value less than 20');
    WHEN var < 30 THEN
      DBMS_OUTPUT.PUT_LINE('Value less than 30');
    ELSE
      DBMS_OUTPUT.PUT_LINE('Other');
  END CASE;
END;
/