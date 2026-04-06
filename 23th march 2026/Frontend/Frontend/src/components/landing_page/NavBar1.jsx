function NavBar1() 
{
    return (
        <div className="flex justify-between px-5 py-5 h-15 bg-black text-white">
            <div className="flex gap-8">
              
             <div className="pl-5 "> <strong>SteveEditor</strong></div>
            </div>
            <div className="flex gap-5">
            <div>Main</div>
            <div>About</div>
            <div>Program</div>
            <div>Price</div>
            <div>Contact</div>
            </div>
            <div className="flex gap-5">
                <div>📸</div>
                <div>📘</div>
                <div>💼</div>
            </div>
        </div>

    );
}
export default NavBar1;