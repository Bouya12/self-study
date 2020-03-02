const studentNumList = new Map();
studentNumList.set("A", 30);
studentNumList.set("B", 31);
studentNumList.set("C", 29);
studentNumList.set("D", 30);
studentNumList.set("E", 32);

const count = studentNumList.size;
console.log("要素数：" + count);
const studentNumC = studentNumList.get("C");
console.log("C組の人数：" + studentNumC);

for (const [key, value] of studentNumList) {
  console.log("キーは" + key + "で値は" + value)
}