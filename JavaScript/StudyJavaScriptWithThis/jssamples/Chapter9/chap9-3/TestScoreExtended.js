class TestScoreExtended extends TestScoreWithConstructor {
  constructor(
    name = "",
    english = 0,
    math = 0,
    japanese = 0,
    science = 0,
    social = 0
  ) {
    super(name, english, math, japanese);
    this.science = science;
    this.social = social;
  }

  calcTotalScore = () => {
    let sum3 = this.calcSum();
    let total = sum3 + this.science + this.social;
    return total;
  };

  calcTotalAve = () => {
    let ave = this.calcTotalScore() / 5;
    return ave;
  };

  // アロー関数はsuperを持たないので通常の関数を使用
  // printScore = () => {
  printScore() {
    super.printScore();
    let total = this.calcTotalScore();
    let ave = this.calcTotalAve();
    console.log(this.name + "さんの５教科合計：" + total + "平均：" + ave);
  }
}
