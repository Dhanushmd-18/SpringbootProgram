function NavBar2()
{
return (
        <div className="flex justify-between px-5 py-5 h-15 text-black">
            <div className="flex gap-8">
              
             <div className="pl-5 "> <strong><h3>SkyExplorer</h3></strong></div>
            </div>
            <div className="flex gap-5">
            <div>Features</div>
            <div>Method</div>
            <div>Pricing</div>
            <div>Changelog</div>
            </div>
            <div className="px-5 py-2 bg-blue-600 text-white rounded-full 
flex items-center justify-center 
hover:bg-blue-700 transition cursor-pointer">Login</div>
        </div>

    );
}
export default NavBar2;