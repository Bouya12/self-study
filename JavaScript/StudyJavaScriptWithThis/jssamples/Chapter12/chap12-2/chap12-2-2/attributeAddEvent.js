const onCheckallChanged = () => {
  const checkall = document.getElementById("checkall");
  if (checkall.checked) {
    checkall.nextSibling.textContent = "すべて外す";
  } else {
    checkall.nextSibling.textContent = "すべてチェック";
  }
  const checkboxes = document.getElementsByName("skill");
  for (let index = 0; index < checkboxes.length; index++) {
    checkboxes[index].checked = checkall.checked;
  }
};
