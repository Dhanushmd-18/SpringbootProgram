import { useState } from "react";

function EvulationCalculator()
{
    const[expression, setExpression]=useState("");
    const[result, setResult]=useState("");

    const Calculator=()=>
    {
        try
        {
            const value=eval(expression);
            setResult(value);
        }
        catch(error)
        {
            setResult("Invalid Expression");
        }

    };

    return(
        <div>
            <input type="text" placeholder="expmple (1*2)" value={expression} onChange={(e)=> setExpression(e.target.value)}/>

            <br />
            <button onClick={Calculator}>calculate</button>
            <h4>Result:{result}</h4>
        </div>

        
    )
}
export default EvulationCalculator;