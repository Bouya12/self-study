DECLARE
  var NUMBER  := 20;
BEGIN
  CASE var
    WHEN 10 THEN
      DBMS_OUTPUT.PUT_LINE('Value is 10');
    WHEN 20 THEN
      DBMS_OUTPUT.PUT_LINE('Value is 20');
    WHEN 30 THEN
      DBMS_OUTPUT.PUT_LINE('Value is 30');
    ELSE
      DBMS_OUTPUT.PUT_LINE('Other');
    END CASE;
END;
/