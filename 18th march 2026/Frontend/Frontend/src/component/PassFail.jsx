import { useState } from "react";
import {z} from "zod";

function PassFail()
{
    const[marks, setMarks]=useState("");
    const[result, setResult]=useState("");

    const schema= z.number().min(0).max(100);

    function checkResult()
    {
        const parsedNumber=umber(marks);
        const Validation = schema.safeParse(parsedNumber);

        if(!Validation.success)
        {
            setResult("Invalid Marks");
            return;
        }

        if(parsedNumber > 35)
        {
            setResult("pass");
        }
        else{
            setResult("fail");
            }
    };

    return(
        <>
        <h6>***************************************************************************</h6>
        <div><h2>Check pass fail</h2></div>
        <input type="number" value={marks} placeholder="Enter number" onChange={(e)=>setMarks(e.target.value)} />
        <button onClick={checkResult}> Check Result</button>
        <p>Result:{result}</p>
        </>
    );
}
export default PassFail;