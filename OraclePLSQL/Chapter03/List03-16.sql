BEGIN
  GOTO label;
    DBMS_OUTPUT.PUT_LINE('Exe1');
    DBMS_OUTPUT.PUT_LINE('Exe2');
    <<label>>
    DBMS_OUTPUT.PUT_LINE('Label execute');
END;
/