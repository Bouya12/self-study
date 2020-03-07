window.addEventListener("DOMContentLoaded", () => {
  const messageArea = document.getElementById("messageArea");
  messageArea.addEventListener("input", () => {
    const message = messageArea.value;
    const msgLength = message.length;
    const showMessageLength = document.getElementById("showMessageLength");
    showMessageLength.textContent = msgLength + "/70";
    if (msgLength > 70) {
      messageArea.classList.add("alertBg");
    } else {
      messageArea.classList.remove("alertBg");
    }
  });
});
