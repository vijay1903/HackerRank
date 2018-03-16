function Polygon(s){
    this.perimeter = function(){
        var i = 0, sum = 0;
        while(i < s.length){
            sum += s[i];
            i++;
        }
        return sum;
    }
}
const rectangle = new Polygon([10, 20, 10, 20]);
const square = new Polygon([10, 10, 10, 10]);
const pentagon = new Polygon([10, 20, 30, 40, 43]);

console.log(rectangle.perimeter());
console.log(square.perimeter());
console.log(pentagon.perimeter());
