const scoreList = new Set();
scoreList.add(30);
scoreList.add(31);
scoreList.add(29);
scoreList.add(30);
scoreList.add(32);

const count = scoreList.size;
console.log("要素数：" + count);
for (const element of scoreList) {
  console.log(element);
}
