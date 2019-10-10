setInterval(() => {
  const timeText = new Date().toLocaleString("ja-JP");
  document.querySelector("#currentTime").textContent = timeText;
  // console.log(timeText);
}, 1000)