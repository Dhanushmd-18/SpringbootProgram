import { useState } from "react";

function TrueFalse()
{
    const[count, setCount]=useState("");

    const switchFuntion =() =>
    {
        setCount(!count);
    };

    return(
        
        <div>
            <h2>On and Off</h2>
            {count && <div> True </div>}
            {!count && <div> False </div>}
            <button onClick={switchFuntion}>Update State</button>
        </div>
        
    );
}
export default TrueFalse;