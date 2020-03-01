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
