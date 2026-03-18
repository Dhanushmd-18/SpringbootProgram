import { useState } from "react";

function Guess()
{
    const [number, setNumber]=useState(20);
    const[guess, setGuess]=useState(" ");
    const[message, setMessage]=useState("Guess it");

    const GuessNumber = () =>
    {
        const num= Number(guess);
        if(num===number)
        {
            setMessage("your guess is correct");
        }
        else
        {
            setMessage("your guess is wrong");
        }
    };

        return (
            <div>
                 <h6>***************************************************************************</h6>
            <h2>Guess the number:</h2>
            <input
        type="number"
        value={guess} placeholder="Guess it"
        onChange={(e) => setGuess(e.target.value)} />

        <button onClick={GuessNumber}>check</button>
        <p>{message}</p>
       
            </div>
        );
    
}
export default Guess;


//onther way to write the code

// import { useState } from "react";

// function Guess()
// {
//   const [number, setNumber]=useState("");
//   const [result, setResult]=useState("Guess it");

//   const Validate =() =>
//   {
//     const hardNumber=20;
//       const userNumber = Number(number);
//     if(userNumber===hardNumber)
//     {
//         setResult("Correct");
//     }
//     else{
//         setResult("wrong");
//     }
//   };

//   return(
//     <>
//     <h6>***************************************************************************</h6>
//     <h2>Guess the Number:</h2>
//     <input type="number" value={number} onChange={(e)=>setNumber(e.target.value)}/>
//     <button onClick={Validate}>verify</button>
//     <p>{result}</p>
//     </>
//   );
// }
// export default Guess;