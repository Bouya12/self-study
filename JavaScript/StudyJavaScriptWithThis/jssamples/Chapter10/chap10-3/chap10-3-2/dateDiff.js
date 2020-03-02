const jobs = new Date(2011, 9, 5);
const jobsMills = jobs.getTime();

const now = new Date();
console.log("現在の日時：" + now.toLocaleString());
const nowMills = now.getTime();
const diffMills = nowMills - jobsMills;
const diffDate = diffMills / (1000 * 60 * 24);
console.log("ジョブズの命日からの経過日：" + Math.floor(diffDate) + "日");
