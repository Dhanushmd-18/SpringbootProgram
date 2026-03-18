import { useState } from "react"

function Numberadd()
{
    const[num1, setNum1]=useState(0);
    const[num2,setNum2]=useState(0);
    const[result, setResult]=useState(0);

    // function double()
    // {
    //     setNum1(Number(num1)+Number(num1));
    // }
    const handleAdd =() =>
    {
        setResult(Number(num1)+Number(num2));
    }


    return(

        <>
        {/* <input type="number" value={num1} onChange={(e)=> setNum1(e.target.value)}/> */}
        <input type="number" value={num1} onChange={(e)=> setNum1(e.target.value)}/>
        <br />
        <br />
        <input type="number" value={num2} onChange={(e)=> setNum2(e.target.value)}/>
        <br />
        <br />
        
         {/* <button onClick={double}>Double it</button> */}
         <button onClick={handleAdd}>Add</button>
        {/* <h1>{num1}</h1> */}
        <h1>Result: {result}</h1>
        </>
    );
}
export default Numberadd;