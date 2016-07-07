/**
 * 用于测试
 * Created by zhongcy on 2016/7/6.
 */
var myApp = {};
var result;
myApp.person = {
    name: 'xiaoming',
    birth: 1990,
    age:getAge
};

function getAge(){
    var year = new Date().getFullYear();
    return year - this.birth;
}

//alert(getAge.apply(myApp.person,[]));
//alert(getAge.call(myApp.person,[]));

/**
 * 高阶函数
 * @param x
 * @param y
 * @param f
 * @returns {*}
 */
function add(x,y,f){
    return f(x)+f(y);
}
result = add(-5,6,Math.abs);

//alert(result);


