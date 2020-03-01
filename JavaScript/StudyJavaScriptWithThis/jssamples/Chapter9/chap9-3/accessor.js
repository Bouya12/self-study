class AccessorProp {
  constructor(lastName, firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }

  get name() {
    return this.lastName + this.firstName;
  }

  set extName(value) {
    this.lastName = value;
    this.firstName = value;
  }
}

const taro = new AccessorProp("中田", "太郎");
console.log("lastName: " + taro.lastName);
console.log("firstName: " + taro.firstName);
console.log("name: " + taro.name);

taro.extName = "山口二郎";
console.log("lastName: " + taro.lastName);
console.log("firstName: " + taro.firstName);
