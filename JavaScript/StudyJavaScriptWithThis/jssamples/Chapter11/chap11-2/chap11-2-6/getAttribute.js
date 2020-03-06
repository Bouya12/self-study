const onFreewordButtonClick = () => {
  const freewordInput = document.getElementById("freewordInput");
  const freewordInputValue = freewordInput.value;
  const freewordInputName = freewordInput.getAttribute("name");
  const showInput = document.getElementById("showInput");

  showInput.textContent =
    "name属性が" + freewordInputName + "の入力された値：" + freewordInputValue;
};
