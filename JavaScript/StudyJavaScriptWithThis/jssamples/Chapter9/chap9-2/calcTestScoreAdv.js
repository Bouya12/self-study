class TestScore {
  constructor() {
    this.name = "";
    this.english = 0;
    this.math = 0;
    this.japanese = 0;
  }

  setData = (name = "", english = 0, math = 0, japanese = 0) => {
    this.name = name;
    this.english = english;
    this.math = math;
    this.japanese = japanese;
  };

  calcSum = () => {
    let sum = this.english + this.math + this.japanese;
    return sum;
  };

  calcAve = () => {
    let sum = this.calcSum();
    let ave = sum / 3;
    return ave;
  };

  printScore = () => {
    let sum = this.calcSum();
    let ave = this.calcAve();
    console.log(this.name + "さんの合計：" + sum + " 平均：" + ave);
  };
}

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
