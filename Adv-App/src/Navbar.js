import { Link } from 'react-router-dom';

const Navbar = () => {
  return (
    <nav className="navbar">
      <h1>Approved</h1>
      <div className="links">
        <Link to="/">Home</Link>
        {/* <Link to="/login">Login</Link> */}
        <Link
          to="/create"
          style={{
            color: 'white',
            backgroundColor: '#f1356d',
            borderRadius: '8px',
          }}
        >
          Create
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;
