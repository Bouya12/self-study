const taro = new TestScoreWithConstructor("たろう", 92, 87, 74);
taro.printScore();

const hanako = new TestScoreWithConstructor("はなこ", 79, 95, 83);
hanako.printScore();

hanako.science = 89;
console.log("はなこさんの理科の点：" + hanako.science);
console.log("たろうさんの理科の点：" + taro.science);
