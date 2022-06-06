import { useState, useEffect } from 'react';
import { useHistory } from 'react-router-dom';
const Login = () => {
  const [userName, setUserName] = useState('');
  const [passWord, setPassword] = useState('');
  const history = useHistory();

  //   useEffect(() => {
  //     if (localStorage.getItem('user-info')) {
  //       history.push('/create');
  //     }
  //   }, []);
  //   async function Login() {
  //     console.warn(userName, passWord);
  //     let data = { userName, passWord };
  //     let result = await fetch('http://localhost:8081/api/app/login', {
  //       method: 'GET',
  //       body: JSON.stringify(data),
  //       headers: {
  //         'Content-Type': 'application/json',
  //       },
  //     });
  //     result = await result.json();
  //     if (result.userName) {
  //       localStorage.setItem('user-info', JSON.stringify(result));
  //       console.log(result);
  //       history.push('/create');
  //     } else {
  //       alert('Please detail');
  //     }
  //   }

  const handleSubmit = (e) => {
    e.preventDefault();
    const data = { userName, passWord };

    fetch('http://localhost:8081/api/app/login', {
      method: 'POST',
      credentials: 'same-origin',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(data),
      userName: [userName],
      //   passWord: passWord,
    })
      .then((response) => response.json())
      .then((data) => {
        console.log('Success:', data);
        console.warn(userName, passWord);
        //serName:serName, passWord
        // history.go(-1);
        if (localStorage.getItem('user-info')) {
          history.push('/create');
        }
      })
      .catch((error) => {
        console.error('Error:', error);
      });
    history.push('/create');
  };

  return (
    <div className="create">
      <h2>Login</h2>
      <form onSubmit={handleSubmit}>
        <label>Username</label>
        <input type="text" required value={userName} onChange={(e) => setUserName(e.target.value)} />
        <label>Password</label>
        <input type="password" required value={passWord} onChange={(e) => setPassword(e.target.value)} />
        <button>Login</button>
      </form>
    </div>
  );
};

export default Login;
