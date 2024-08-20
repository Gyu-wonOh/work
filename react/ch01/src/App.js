
import React,{useState} from 'react';
import './App.css';
import logo from './logo.svg';


function Header(props) {
  return (
    <header style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <div style={{ display: 'flex', alignItems: 'center' }}>
        <img src={logo} alt="Logo" style={{ height: '40px', marginRight: '10px' }} />
        <img src="logo192.png" alt="Logo" style={{ height: '40px', marginRight: '10px' }} />
        <h1 style={{ margin: 0 }}><a href="\" on onClick={
          (event)=>{
          event.preventDefault();
          props.onChangeMode();
        }
        }>Student Info</a></h1>
      </div>
    </header>
  );
}
function Nav(props) {
  const list = props.students.map((t) => (
    <li key={t.id}>
      <a
        id={t.id}
        href={'/read/' + t.id}
        onClick={(event) => {
          event.preventDefault();
          props.onChangeMode(event.target.id);
        }}
      >
        {t.name}
      </a>
    </li>
  ));
  return (
    <nav style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <ol>{list}</ol>
    </nav>
  );
}






function Article(props) {
  return (
    <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
      <h2>{props.title}</h2>
      {props.body}
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

  const [mode,setMode] =useState('MENU');

  const students=[
    { id: 1, name: 'Alice', username: 'alice123', age: 21, height: 160, joinDate: '2020-01-01' },
    { id: 2, name: 'Bob', username: 'bob123', age: 22, height: 170, joinDate: '2019-03-15' },
    { id: 3, name: 'Charlie', username: 'charlie123', age: 23, height: 180, joinDate: '2018-05-10' },
    { id: 4, name: 'Dave', username: 'dave123', age: 24, height: 175, joinDate: '2017-07-20' },
  ];
let contentSelectMenu =<Article title="Select No" body="Welcome to the Student Info App" />;

switch(mode){
  case "MENU"://상단 탭 클릭시
    contentSelectMenu =<Article title="Select Top Menu" body="Welcome to the Student Info App" />;
    break;
  case "READ"://학생데이터 클릭시
  contentSelectMenu =<Article title="Select Student" body="Welcome to the Student Info App" />;
  break;
  case "CREATE"://학생데이터 등록시
  contentSelectMenu =<Article title="Select Student" body="Welcome to the Student Info App" />;
  break;
  case "UPDATE"://학생데이터 수정시
  contentSelectMenu =<Article title="Select Student" body="Welcome to the Student Info App" />;
  break;
}






  return (
    <div style={{ border: '2px solid black', padding: '10px' }}>
      <Header onChangeMode={
        ()=>{
          setMode("MENU");
        }} />
      <Nav
        students={students}
        onChangeMode={(id) => {
          setMode('READ');  
          alert(id);
        }}
      />
     {contentSelectMenu}
      <Footer onChangeMode={
        (create)=>{
          setMode("CREATE");
        }}
      
      /> {/* Footer 컴포넌트를 여기에서 추가합니다 */}
    </div>
  );
}




export default App;





// import React, { useState } from 'react';
// const MyComponent = () => {
//     // 상태 변수와 상태를 업데이트하는 함수 선언
//     const [count, setCount] = useState(0);
//     // 상태를 업데이트하는 함수
//     //var count = 0;
//     const increment = () => {
//       setCount(count + 1);
//       //count++;
//     };
//     return (
//         <div>
//             <p>Count: {count}</p>
//             <button onClick={increment}>Increment</button>
//         </div>
//     );
// };


// function App() {
 
//   return (
//     <div>
//       <MyComponent/>      
//     </div>
//   );
// }


// export default App;





// import React from 'react';
// function ChildComponent(prop) {
//   return (
//     <div>
//       {/* prop 객체를 통해 handleClick 함수에 접근합니다. */}
//       <button onClick={prop.handleClick}>클릭하세요</button>
//     </div>
//   );
// }


// function App() {
//   // 이벤트 핸들러
//   const handleClick = () => {
//     alert('버튼이 클릭되었습니다!');
//   };
//   const handleClick1 = () => {
//     alert('handleClick1 이벤트 헨들러');
//   };
//   return (
//     <div>
//       {/* ChildComponent에 handleClick 함수를 prop으로 전달합니다. */}
//       <ChildComponent handleClick={handleClick} />
//       <ChildComponent handleClick={handleClick} />
//       <ChildComponent handleClick={handleClick1} />
//     </div>
//   );
// }

// import React from 'react';
// import './App.css';
// import logo from './logo.svg';


// function Header() {
//   return (
//     <header style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <div style={{ display: 'flex', alignItems: 'center' }}>
//         <img src={logo} alt="Logo" style={{ height: '40px', marginRight: '10px' }} />
//         <img src="logo192.png" alt="Logo" style={{ height: '40px', marginRight: '10px' }} />
//         <h1 style={{ margin: 0 }}>Student Info</h1>
//       </div>
//     </header>
//   );
// }

// function Nav(props) {
//   const list = props.students.map((t) => (
//     <li key={t.id}>
//       <a
//         id={t.id}
//         href={'/read/' + t.id}
//         onClick={(event) => {
//           event.preventDefault();
//           props.onChangeMode(event.target.id);
//         }}
//       >
//         {t.name}
//       </a>
//     </li>
//   ));
//   return (
//     <nav style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <ol>{list}</ol>
//     </nav>
//   );

// }




// /*function Nav() {
//   return (
//     <nav style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <ol>
//         <li>Alice</li>
//         <li>Bob</li>
//         <li>Charlie</li>
//         <li>Dave</li>
//       </ol>
//     </nav>
//   );
// }*/

// function Article(props) {
//   return (
//     <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <h2>{props.title}</h2>
//       {props.body}
//     </article>
//   );
// }

// /*function Article() {
//   return (
//     <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <h2>Select Menu</h2>
//       <p>Welcome to the Student Info App</p>
//     </article>
//   );
// }*/


// function Create() {
//   return (
//     <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <h2>Create</h2>
//       <form>
//         <p><input type="text" placeholder="name" /></p>
//         <p><input type="text" placeholder="username" /></p>
//         <p><input type="number" placeholder="age" /></p>
//         <p><input type="number" placeholder="height" /></p>
//         <p><input type="date" placeholder="join date" /></p>
//         <p><input type="submit" value="Create" /></p>
//       </form>
//     </article>
//   );
// }


// function Update() {
//   return (
//     <article style={{ border: '2px solid black', padding: '10px', marginBottom: '10px' }}>
//       <h2>Update</h2>
//       <form>
//         <p><input type="text" defaultValue="name" placeholder="name" /></p>
//         <p><input type="text" defaultValue="username" placeholder="username" /></p>
//         <p><input type="number" defaultValue="age" placeholder="age" /></p>
//         <p><input type="number" defaultValue="height" placeholder="height" /></p>
//         <p><input type="date" defaultValue="join date" placeholder="join date" /></p>
//         <p><input type="submit" value="Update" /></p>
//       </form>
//     </article>
//   );
// }


// function Footer() {
//   return (
//     <footer style={{ border: '2px solid black', padding: '10px', marginTop: '10px' }}>
//       <ul>
//         <li><a href="/create">Create</a></li>
//         <li><a href="/update">Update</a></li>
//       </ul>
//     </footer>
//   );
// }


// function App() {
//   const students=[
//     { id: 1, name: 'Alice', username: 'alice123', age: 21, height: 160, joinDate: '2020-01-01' },
//     { id: 2, name: 'Bob', username: 'bob123', age: 22, height: 170, joinDate: '2019-03-15' },
//     { id: 3, name: 'Charlie', username: 'charlie123', age: 23, height: 180, joinDate: '2018-05-10' },
//     { id: 4, name: 'Dave', username: 'dave123', age: 24, height: 175, joinDate: '2017-07-20' },
//   ];


//   return (
//     <div style={{ border: '2px solid black', padding: '10px' }}>
//       <Header />
//       <Nav
//         students={students}
//         onChangeMode={(id) => {
//             alert(id);
//         }}
//       />

//       <Article title="Select Student" body="Welcome to the Student Info App" />
//       <Footer /> {/* Footer 컴포넌트를 여기에서 추가합니다 */}
//     </div>
//   );
// }



// export default App;
