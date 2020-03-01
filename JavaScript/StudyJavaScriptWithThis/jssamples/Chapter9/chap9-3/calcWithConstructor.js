let taro = new TestScoreWithConstructor("たろう", 92, 87, 74);
taro.printScore();

let hanako = new TestScoreWithConstructor("はなこ", 79, 95, 83);
hanako.printScore();

let taroSum = taro.calcSum();
let hanakoSum = hanako.calcSum();
let ave2 = (taroSum + hanakoSum) / 2;
console.log("二人の合計の平均：" + ave2);

let taroAve = taro.calcAve();
let hanakoAve = hanako.calcAve();
let aveAve = (taroAve + hanakoAve) / 2;
console.log("二人の平均の平均：" + aveAve);
