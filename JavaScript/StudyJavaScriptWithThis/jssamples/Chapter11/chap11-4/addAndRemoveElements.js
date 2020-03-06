const onAddListItemButtonClick = () => {
  const addListItemInput = document.getElementById("addListItemInput");
  const addListItemInputText = addListItemInput.value;
  const listItem = document.createElement("li");
  listItem.textContent = addListItemInputText;
  listItem.classList.add("blueText");
  const skillList = document.getElementById("skillList");

  skillList.appendChild(listItem);
};

const onRemoveListItemButtonClick = () => {
  const skillList = document.getElementById("skillList");

  skillList.removeChild(skillList.lastElementChild);
};

const onAddLinkButtonClick = () => {
  const addLinkUrlText = document.getElementById("addLinkUrl").value;
  const addLinkNameText = document.getElementById("addLinkName").value;
  const addHtml = '<a href="' + addLinkUrlText + '">' + addLinkNameText + "</a>";
  let addLink = document.getElementById("addLink");
  addLink.innerHTML = addHtml;
};
