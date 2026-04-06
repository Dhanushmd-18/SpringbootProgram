import {Link} from 'react-router-dom';
export default function Home() {
    const[fruitInput , setFruitInput]=useState(" ");
    const[fruits, setFruits]=useState(()=> {
    const saved=localStorage.getItem("fruits");
    return saved? JSON.parse(saved) : [];
});

useEffect(()=>
{
    localStorage.setItem("fruits", JSON.stringify(fruits));
},[fruits]);

const handleAddFruit=()=>
{
    if(fruitInput.trim()==="")return;
    setFruits([...fruits, fruitInput]);
    setFruitInput("");  
};

const handleDeleteFruit=(index)=>
{
    const updated=fruits.filter((_,i)=> i!=index);
    setFruits(updated);
};

return(
    <>
    <div>
        <h2>Home page</h2>
        <Link to={"/"}>Home</Link>
        <Link to={"/About"}>About us</Link>
        <input type="text"  placeholder="Enter Fruit" value={fruitInput} onChange={(e)=> setFruitInput(e.target.value)}/>

        <button onClick={handleAddFruit}>Add Fruit</button>
        <ul>
            {fruits.map((fruit,index)=>(
                <li key={index}>
                    {fruit}
                    <button onClick={()=> handleDeleteFruit(index)}>
                        Delete {index}</button>
                </li>
            ))}
        </ul>
    </div>
    </>
);
    // return (
    //     <>
    //         <h1>Home</h1>
    //         <p>This is the home page</p>
            
    //         <Link to="/About">About</Link>
            

           
    //     </>
    // )
}
            

       
   
 