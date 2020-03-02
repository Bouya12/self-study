const studentNameList = { A: 30, B: 31, C: 29, D: 30, E: 32 };
console.log("C組の人数：" + studentNameList["C"]);
console.log("E組の人数：" + studentNameList.E);

studentNameList.F = 28;
console.log("F組の人数：" + studentNameList.F)
