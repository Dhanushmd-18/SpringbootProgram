import { useState } from "react";

function PrimeNumber()
{
    const[num, setNum]=useState("");
    const[result, setResult]=useState("");

    const Prime =()=>
    {
        const n=Number(num);
        let isPrime=true;

        if (num<=1) isPrime=false;
        
        for(let i=2;i<n;i++)
        {
            if(n%i===0)
            {
                isPrime=false;
            }
        }
        // setresult(isPrime? "it is prime Number" : "it is not prime number");
        if(isPrime)
        {
            setResult("it is prime number");
        }
        else
        {
            setResult("it is not prime number");
        }
    };

    return(
        <>
        <h6>***************************************************************************</h6>
        <h2>Check prime Number:</h2>
        <input type="number" value={num} placeholder="Enter number" onChange={(e)=>setNum(e.target.value)} />
        <button onClick={Prime}>Check Number</button>
        <p>Result: {result}</p>
        </>
    );
}
export default PrimeNumber;