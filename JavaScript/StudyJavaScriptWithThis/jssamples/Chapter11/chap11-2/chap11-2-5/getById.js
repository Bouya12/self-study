const onH1ButtonClick = () => {
  const headTitle = document.getElementById("headTitle");

  console.log(headTitle);
};

const onH1TextButtonClick = () => {
  const headTitle = document.getElementById("headTitle");
  const headTitleText = headTitle.textContent;
  console.log(headTitleText);
};

const onH1TextAltButtonClick = () => {
  const headTitle = document.getElementById("headTitle")
  headTitle.textContent = "idによる取得サンプル"
}