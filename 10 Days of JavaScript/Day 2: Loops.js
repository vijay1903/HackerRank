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

function vowelsAndConsonants(s) {
    var a = s;
    //console.log(a);
    
    for(var i = 0; i < a.length; i++){
        if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u')){
            console.log(a[i]);
        }
    }
    for(var i = 0; i < a.length; i++){
        if(!((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u'))){
            console.log(a[i]);
        }
    }
            
        
}

function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}
