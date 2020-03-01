let taro = new TestScore();
taro.setData("たろう", 92, 87, 74);
taro.printScore();

let hanako = new TestScore();
hanako.setData("はなこ", 79, 95, 83);
hanako.printScore();

let taroSum = taro.calcSum();
let hanakoSum = hanako.calcSum();
let ave2 = (taroSum + hanakoSum) / 2;
console.log("二人の合計の平均：" + ave2);

let taroAve = taro.calcAve();
let hanakoAve = hanako.calcAve();
let aveAve = (taroAve + hanakoAve) / 2;
console.log("二人の平均の平均：" + aveAve);
