import React from 'react';
import './App.css';
import logo from './logo.svg';


function Header() {
  return (
    <header style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <div style={{ display: 'flex', alignItems: 'center' }}>
        <img src={logo} alt="Logo" style={{ height: '40px', marginRight: '10px' }} />
        <img src="logo192.png" alt="Logo" style={{ height: '40px', marginRight: '10px' }} />
        <h1 style={{ margin: 0 }}>Student Info</h1>
      </div>
    </header>
  );
}


function Nav() {
  return (
    <nav style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <ol>
        <li>Alice</li>
        <li>Bob</li>
        <li>Charlie</li>
        <li>Dave</li>
      </ol>
    </nav>
  );
}


function Article() {
  return (
    <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <h2>Select Menu</h2>
      <p>Welcome to the Student Info App</p>
    </article>
  );
}


function Create() {
  return (
    <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <h2>Create</h2>
      <form>
        <p><input type="text" placeholder="name" /></p>
        <p><input type="text" placeholder="username" /></p>
        <p><input type="number" placeholder="age" /></p>
        <p><input type="number" placeholder="height" /></p>
        <p><input type="date" placeholder="join date" /></p>
        <p><input type="submit" value="Create" /></p>
      </form>
    </article>
  );
}


function Update() {
  return (
    <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <h2>Update</h2>
      <form>
        <p><input type="text" defaultValue="name" placeholder="name" /></p>
        <p><input type="text" defaultValue="username" placeholder="username" /></p>
        <p><input type="number" defaultValue="age" placeholder="age" /></p>
        <p><input type="number" defaultValue="height" placeholder="height" /></p>
        <p><input type="date" defaultValue="join date" placeholder="join date" /></p>
        <p><input type="submit" value="Update" /></p>
      </form>
    </article>
  );
}


function Footer() {
  return (
    <footer style={{ border: '2px solid black', padding: '10px', marginTop: '10px' }}>
      <ul>
        <li><a href="/create">Create</a></li>
        <li><a href="/update">Update</a></li>
      </ul>
    </footer>
  );
}


function App() {
  return (
    <div style={{ border: '2px solid black', padding: '10px' }}>
      <Header />
      <Nav />
      <Create />
      <Footer /> {/* Footer 컴포넌트를 여기에서 추가합니다 */}
    </div>
  );
}
export default App;
