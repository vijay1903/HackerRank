'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}
function getSecondLargest(nums) {
    var max = 0, max2 = 0, temp;
    for(var i = 0 ; i<nums.length; i++){
        for(var j = i; j<nums.length; j++){
            if(nums[i]>nums[j]){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    max = nums[(nums.length-1)];
    for(var i = (nums.length-1); i >=0 ; i--){
        if(nums[i]<max){
            max2 = nums[i];
            break;
        }
    }
    return max2;
}
function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
