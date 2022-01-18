//First Problem Solving Code in Javascript
process.stdin.resume()
process.stdin.setEncoding("utf-8")
let std_input = ""
process.stdin.on("data",function (inp){
    std_input +=inp;
})
process.stdin.on("end", function () {
   main(std_input);
});

function main(s/* string  */){
    let l = s.length;//length of s
    let res = "Yes";//resultant String
    if(l<3)
        res = "No";
    let countsOf ={};
    countsOf['z']=0;
    countsOf['o']=0;
    let correctCh = 'z';
    for(let i=0;i<l;i++){
        if(s[i]==correctCh)
            countsOf[s[i]]+=1;
        else if(correctCh=='o'){
            res="No";
            break;
            }
        else {
            correctCh='o';
            countsOf[s[i]]+=1;
            }
    }
    // process.stdout.write(countsOf['z']+" "+countsOf['o']+"\n");
    process.stdout.write(countsOf['z']*2==countsOf['o']?res:"No");
}
