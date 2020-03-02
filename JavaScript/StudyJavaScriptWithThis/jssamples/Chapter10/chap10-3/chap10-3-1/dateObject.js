const jobs = new Date(2011, 9, 5);
console.log("ジョブズの命日：" + jobs.toDateString());
console.log("ジョブズの命日：" + jobs.toLocaleDateString());

const month = jobs.getMonth();
jobs.setMonth(month + 1);
console.log("1ヶ月後：" + jobs.toLocaleDateString());

const date = jobs.getDate();
jobs.setDate(date - 6);
console.log("6日前：" + jobs.toLocaleDateString());
