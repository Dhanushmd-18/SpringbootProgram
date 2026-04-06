
import Addition from "./components/addition";
import Hello from "./components/Hello";
import Home from "./components/Home";
import Add from "./example/add";
import Calculator from "./example/Calculator";
import EvulationCalculator from "./example/EvulationCalculator";
import Numberadd from "./example/Numberadd";

function App(){
  return(
    <div>
      <>
      <Home />
      <Hello name={"Dhanush M D"} age={21} address={"Sringeri"} phone={9483168044}/>
      <Add />
      <Addition a={10} b={5}/>
      <Numberadd/>
      <Calculator/>
      <EvulationCalculator/>
      </>
    </div>
  );
}
export default App;