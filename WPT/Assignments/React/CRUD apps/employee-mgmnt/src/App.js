import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import MainHeaderNavBar from "./components/MainHeaderNavBar";
import { Navigate, Route, Routes } from "react-router-dom";
import HomeComponent from "./components/HomeComponent";
import EmployeeTable from "./components/EmployeeTable";

function App() {
  return (
    <div className="App">
      <MainHeaderNavBar />
      <Routes>
        <Route
          path="/"
          element={<Navigate replace to="/home"></Navigate>}
        ></Route>
        <Route path="/home" element={<HomeComponent />}></Route>
        <Route path="/table" element={<EmployeeTable />}></Route>
      </Routes>
    </div>
  );
}

export default App;
