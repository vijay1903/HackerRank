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
function reverseString(s){
    try {
        if(typeof(s) != "string") throw "s.split is not a function";
        if(typeof(s) == "string"){
            var a ="";
            for(var i = (s.length-1), j = 0; i >= 0, j < s.length; i--, j++){
                a+=s[i]; 
            }
            s=a;
        }
        
    } catch(err) {
            console.log(err);
    } finally {
        console.log(s);
    }
}
function main() {
    const s = eval(readLine());
    
    reverseString(s);
}
