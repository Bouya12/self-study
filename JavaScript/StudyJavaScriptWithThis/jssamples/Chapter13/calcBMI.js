window.addEventListener("DOMContentLoaded", () => {
  const heightInput = document.getElementById("heightInput");
  const weightInput = document.getElementById("weightInput");

  const checkInput = () => {
    let buttonEnable = true;

    const heightStr = heightInput.value;
    const height = Number(heightStr);
    const heightInputMsg = document.getElementById("heightInputMsg");
    if (heightStr.length === 0) {
      buttonEnable = false;
      heightInputMsg.textContent = "身長を入力してください";
    } else if (!isFinite(height)) {
      buttonEnable = false;
      heightInputMsg.textContent = "身長には数値を入力してください";
    } else if (height <= 0) {
      buttonEnable = false;
      heightInputMsg.textContent = "身長には正数を入力してください";
    } else {
      heightInputMsg.textContent = "";
    }

    const weightStr = weightInput.value;
    const weight = Number(weightStr);
    const weightInputMsg = document.getElementById("weightInputMsg");
    if (weightStr.length === 0) {
      buttonEnable = false;
      weightInputMsg.textContent = "体重を入力してください";
    } else if (!isFinite(weight)) {
      buttonEnable = false;
      weightInputMsg.textContent = "体重には数値を入力してください";
    } else if (weight <= 0) {
      buttonEnable = false;
      weightInputMsg.textContent = "体重には正数を入力してください";
    } else {
      weightInputMsg.textContent = "";
    }

    const calcBMIButton = document.getElementById("calcBMIButton");
    if (buttonEnable) {
      calcBMIButton.removeAttribute("disabled");
    } else {
      calcBMIButton.setAttribute("disabled", "disabled")
    }
  };

  heightInput.addEventListener("input", checkInput);
  heightInput.addEventListener("blur", checkInput);

  weightInput.addEventListener("input", checkInput);
  weightInput.addEventListener("blur", checkInput);
});

const onCalcBMIButtonClick = () => {
  const heightInput = document.getElementById("heightInput");
  const height = heightInput.value;
  const weightInput = document.getElementById("weightInput");
  const weight = weightInput.value;

  const bmiObj = new BMI(height, weight);
  const bmi = bmiObj.getBMI();

  const bmiResult = document.getElementById("bmiResult");

  bmiResult.textContent = bmi;

  const advice = bmiObj.getAdvice();
  const adviceMessage = document.getElementById("adviceMessage");
  adviceMessage.textContent = advice;

  const resultMessage = document.getElementById("resultMessage");
  resultMessage.classList.remove("displayNone");
};
