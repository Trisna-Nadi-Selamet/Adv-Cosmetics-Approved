import { useState } from 'react';

const Create = () => {
  const [dataid, setDataid] = useState('');
  const [description, setDesc] = useState('');
  const [category, setBody] = useState('');
  const [userName, setUsername] = useState('');
  const [status, setStatus] = useState('in Progress');

  const resetInputField = () => {
    window.location.reload(false);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const data = { dataid, description, category, userName, status };
    fetch('http://localhost:8081/api', {
      credentials: 'same-origin',
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(data),
    })
      .then((response) => response.json())
      .then((data) => {
        console.log('Success:', data);
      })
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  return (
    <div className="create">
      <h2>Add a New Approved</h2>
      <form onSubmit={handleSubmit}>
        <label>Code Document :</label>
        <input type="text" required value={dataid} onChange={(e) => setDataid(e.target.value)} />
        <label>Category :</label>
        <input type="text" required value={description} onChange={(e) => setDesc(e.target.value)} />
        <label>Description :</label>
        <textarea required value={category} onChange={(e) => setBody(e.target.value)}></textarea>
        <label>Name :</label>
        <input type="text" required value={userName} onChange={(e) => setUsername(e.target.value)} />
        <label>Status :</label>
        <select value={status} onChange={(e) => setStatus(e.target.value)}>
          <option value="In progress">in progress</option>
        </select>
        <button onClick={resetInputField}>Add post</button>
      </form>
    </div>
  );
};

export default Create;
