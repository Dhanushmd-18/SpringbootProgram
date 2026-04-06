function ListDisplay()
{
    const users=["A", "B","C","D"];

    return(
        <>
            {users.map((user, index)=>(   
                <div key={index}>{user}</div>)  

            )}
        </>
    );

}
export default ListDisplay;