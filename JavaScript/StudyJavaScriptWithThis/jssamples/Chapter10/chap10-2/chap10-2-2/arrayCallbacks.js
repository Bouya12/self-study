const isMultiplesOf13 = (currentValue, index, array) => {
  return currentValue % 13 === 0;
};

let list = [];
for (let index = 0; index < 10; index++) {
  list[index] = Math.round(Math.random() * 100);
}
console.log(list.toString());

const result = list.some(isMultiplesOf13);
console.log("配列内に13の倍数は含まれるか：" + result);

const newList = list.map((currentValue, index, array) => {
  return currentValue / 100;
});
console.log(newList.toString());
