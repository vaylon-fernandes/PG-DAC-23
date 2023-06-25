import logo from "./logo.svg";
import "./App.css";
import "./components/MyButton";
function App() {
  return <div className="App"></div>;
}

const MyButton = () => {
  return <button>I'm a button</button>;
};

export default function MyApp() {
  return (
    <div className="App">
      <h1>Welcome to my app</h1>
      <MyButton /> <br></br>
      <MyButton />
    </div>
  );
}

// export default App;
