// import { useState } from "react";

import TrueFalse from "./component/TrueFalse";
import Guess from "./component/Guess";
import Grading from "./component/Grading";
import ListDisplay from "./component/ListDisplay";
import PrimeNumber from "./component/PrimeNumber";
import PrimeList from "./component/PrimeList";
import PassFail from "./component/PassFail";

 
 

 function App()
 {
  // const[count, setCount]=useState(0);

  // const incrementCount = () =>
  // {
  //   setCount(count + 1);
  // }

  // const decrementCount= () =>
  // {
  //   setCount(count - 1);
  // }

  // return(
  //   <>
  //   <div>total count: {count}</div>
  //   <button onClick={incrementCount}>Add +1</button>
  //   <button onClick={decrementCount}>sub -1</button>
  //   </>
  // );
  return(
    
      <>
      <TrueFalse/> 
      <Guess/> 
      <Grading/>
      <ListDisplay/>
      <PrimeNumber/>
      <PrimeList/>
      <PassFail/>
      </>

   
  
  );  
 }
 export default App;