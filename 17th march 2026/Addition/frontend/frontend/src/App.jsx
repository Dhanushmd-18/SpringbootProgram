 import { useState } from "react";
import axios from "axios";

function App() {
  const [a, setA] = useState("");
  const [b, setB] = useState("");
  const [result, setResult] = useState("");

  const handleAdd = async () => {
    try {
      const response = await axios.post("http://localhost:8080/add", {
        a: Number(a),
        b: Number(b),
      });

      setResult(response.data.result);
    } catch (error) {
      console.error(error);
      setResult("Error");
    }
  };

  return (
    <div >
      <h1>Add Two Numbers</h1>

      <input
        type="number"
        placeholder="Enter A"
        value={a}
        onChange={(e) => setA(e.target.value)}
      />
      <br /><br />

      <input
        type="number"
        placeholder="Enter B"
        value={b}
        onChange={(e) => setB(e.target.value)}
      />
      <br /><br />

      <button onClick={handleAdd}>Add</button>

      {/* ✅ Result shown just below button */}
      <div style={{ marginTop: "20px" }}>
        {result !== "" && <h2>Result: {result}</h2>}
      </div>
    </div>
  );
}

export default App;