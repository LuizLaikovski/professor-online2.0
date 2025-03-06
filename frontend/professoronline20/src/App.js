import './App.css';
import Form from './component/Form';
import Table from './component/Table';
import React, { useState } from 'react';

function App() {

  const [btnCadastrar, setBtnCadastrar] = useState(true);

  return (
    <div>
      <Form botao={btnCadastrar} />
      <Table />
    </div>
  );
}

export default App;
