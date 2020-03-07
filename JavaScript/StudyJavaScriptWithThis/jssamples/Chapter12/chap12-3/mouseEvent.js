const init = () => {
  const outerBox = document.getElementById("outerBox");

  outerBox.addEventListener("mousemove", event => {
    const innerBox = document.getElementById("innerBox");
    innerBox.textContent = "x=" + event.offsetX + ":y=" + event.offsetY;
  });
  outerBox.addEventListener("mouseenter", onMouseInOutEvent);
  outerBox.addEventListener("mouseleave", onMouseInOutEvent);
  outerBox.addEventListener("mouseover", onMouseInOutEvent);
  outerBox.addEventListener("mouseout", onMouseInOutEvent);
};

const onMouseInOutEvent = event => {
  const msgList = document.getElementById("msgList");
  const targetId = event.target.id;
  const type = event.type;
  const item = document.createElement("li");
  item.textContent += targetId + "に" + type + "が発生";
  msgList.appendChild(item);
};

const removeMouseInOutEvent = () => {
  const outerBox = document.getElementById("outerBox");
  outerBox.removeEventListener("mouseenter", onMouseInOutEvent);
  outerBox.removeEventListener("mouseleave", onMouseInOutEvent);
  outerBox.removeEventListener("mouseover", onMouseInOutEvent);
  outerBox.removeEventListener("mouseout", onMouseInOutEvent);
  const msgList = document.getElementById("msgList");
  msgList.innerHTML = "";
};

window.addEventListener("DOMContentLoaded", init);
