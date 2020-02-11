let createMail = (recv, bill) => {
  let msg = `
${recv}様
PT企画の斎藤です。
今月の請求額は${bill}です。
`
  console.log(msg);
};

let addCharge = (bill) => {
    return bill * 1.0;
};

let data = [
  {name:'山本', bill:40000,crg:true},
  {name:'吉田', bill:25000,crg:false}
];

for (let rec of data) {
  let bill = rec['bill']
  if (rec['crg']) {
    bill = addCharge(bill);
  }
  createMail(rec['name'], bill);
}
