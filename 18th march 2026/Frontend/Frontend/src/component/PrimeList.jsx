import { useState } from "react";

function PrimeList()
{
    const[num, setNum]=useState("");
    const[result, setResult]=useState([]);

    const Prime=()=>
    {
        const n=Number(num);
        const arr=num.split(",");
        let output=[];
        let isPrime;

        for(let j=0;j<arr.length;j++)
        {
              let n = Number(arr[j]);   
            let isPrime=true;
             if (n<=1)isPrime=false;
        
        for(let i=2;i<n;i++)
        {
            if(n%i===0)
            {
                isPrime=false;
                  break; 
            }
           
        }

        if(isPrime)
        {
            output.push(n +" is Prime");
        }
        else{
            output.push(n +" is Not Prime")
        }
        }
        setResult(output);
    };

    return(
        <>
        <h6>***************************************************************************</h6>
        <h2>Check List of prime Number:</h2>

        <input  value={num} placeholder="enter ex: 12,34,54" onChange={(e)=>setNum(e.target.value)} />
        <button onClick={Prime}>Check</button>

        {result.map((res, index) => (
        <p key={index}>{res}</p>
      ))}
      
        </>
    );
}
export default PrimeList;

