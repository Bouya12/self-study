const onP2RedButtonClick = () => {
  const showText = document.getElementById("showText");
  showText.setAttribute("class", "redText");
};

const onP2DefaultButtonClick = () => {
  const showText = document.getElementById("showText");
  showText.removeAttribute("class");
};
