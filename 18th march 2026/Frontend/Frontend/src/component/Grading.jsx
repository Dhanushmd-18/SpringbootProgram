import { useState } from "react";

function Grading()
{
    const[marks, setMarks]=useState("");
    const[grade, setGrade]=useState(" ");  
    const gradingSystem =() =>
    {
        const num= Number(marks)
        if(num>=90)
        {
            setGrade("A Grade");
        }
        else if(num>=80)
        {
            setGrade("B Grade")
        }
        else if(num>=65)
        {
            setGrade("c Grade")
        }
        else if(num>49)
        {
            setGrade("D Grade");
        }  
        else if(num>=40)
        {
            setGrade("E Grade");
        }
        else{
            setGrade("fail");
        }
    };

    return(
        <>
        <h6>***************************************************************************</h6>
        <h2>check your result:</h2>
        <input type="number"  placeholder="Enter Marks"
        value={marks} onChange={(e)=> setMarks(e.target.value)} />
        <button onClick={gradingSystem}>Result</button>
        <h5> Grade: {grade}</h5>
        <h6>***************************************************************************</h6>
        </>
    );
}
export default Grading;