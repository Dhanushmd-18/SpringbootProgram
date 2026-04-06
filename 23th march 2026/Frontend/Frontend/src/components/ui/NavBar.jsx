function NavBar()
{
    return(
        <div className="flex justify-between px-5">
            <div className="flex gap-5">
             <div>LOGO</div>
             <div>JCBM College</div>
            </div>
            <div className="flex gap-5">
            <div>Home</div>
            <div>About Us</div>
            <div>Service</div>
            <div>Product</div>
            <div>Contact Us</div>
            </div>
            <div className="flex gap-5">
                <div>Sign up</div>
                <div>Login</div>
            </div>
        </div>
    );
}
export default NavBar;