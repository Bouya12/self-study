const onTagButtonClick = () => {
  const buttonTags = document.getElementsByTagName("button");
  let result = "";
  for (let index = 0; index < buttonTags.length; index++) {
    result += buttonTags[index].textContent + ":";
  }
  const resultP = document.getElementById("result");
  resultP.textContent = result;
};

const onClassButtonClick = () => {
  const redElements = document.getElementsByClassName("redText");
  let result = "";
  for (let index = 0; index < redElements.length; index++) {
    result += redElements[index].textContent + ":";
  }
  const resultP = document.getElementById("result");
  resultP.textContent = result;
};

const onNameButtonClick = () => {
  const checkboxes = document.getElementsByName("skill");
  let result = "チェックされたもの：";
  for (let index = 0; index < checkboxes.length; index++) {
    if (checkboxes[index].checked) {
      result += checkboxes[index].value + ",";
    }
  }
  const resultP = document.getElementById("result");
  resultP.textContent = result;
};
