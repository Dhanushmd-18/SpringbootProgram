import { useState } from "react";
import "./Calculator.css";

function Calculator()
{
    const [num1,setNum1] = useState(0);
    const [num2,setNum2] = useState(0);
    const [result,setResult] = useState(0);

    const handleAdd = () =>{
        setResult(Number(num1) + Number(num2));
    }

    const handleSub = () =>{
        setResult(Number(num1) - Number(num2));
    }

    const handlemul = () =>{
        setResult(Number(num1) * Number(num2));
    }

    const handleDiv = () =>{
        setResult(Number(num1) / Number(num2));
    }

    return(

        <div className="calculator-container">

        <input
        className="calculator-input"
        type="number"
        value={num1}
        onChange={(e)=> setNum1(e.target.value)}
        />

        <input
        className="calculator-input"
        type="number"
        value={num2}
        onChange={(e)=> setNum2(e.target.value)}
        />

        <div>
        <button className="calculator-button" onClick={handleAdd}>Add</button>
        <button className="calculator-button" onClick={handleSub}>Subtract</button>
        <button className="calculator-button" onClick={handlemul}>Multiply</button>
        <button className="calculator-button" onClick={handleDiv}>Division</button>
        </div>

        <h1 className="calculator-result">Result: {result}</h1>

        </div>
    );
}

export default Calculator;