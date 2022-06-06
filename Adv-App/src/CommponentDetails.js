import { useParams } from 'react-router-dom';
import { useState } from 'react';
//import { useHistory } from 'react-router-dom';
import useFetch from './useFetch';

const CommponentDetails = () => {
  const { id } = useParams();
  const { data: app, error, isPending } = useFetch('http://localhost:8081/api/' + id);
  //const history = useHistory();
  const [dataid, setDataid] = useState('');
  const [description, setDesc] = useState('');
  const [category, setBody] = useState('');
  const [userName, setUsername] = useState('');
  const [status, setStatus] = useState('Approved');

  const resetInputField = () => {
    window.location.reload(false);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const puttIn = { id, dataid, description, category, userName, status };

    console.log(puttIn);
    fetch('http://localhost:8081/api/', {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },

      body: JSON.stringify(puttIn),
    })
      .then((response) => response.json())
      .then(() => {
        //  history.push('/');
      })
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  return (
    <div className="blog-details">
      <form onSubmit={handleSubmit}>
        {isPending && <div>Loading...</div>}
        {error && <div>{error}</div>}
        {app && (
          <article>
            <h2>{app.category}</h2>
            <p>By Name {app.userName}</p>
            <div>
              <b>Term : </b>
              {app.description}
            </div>
            <div className="create">
              <select value={status} onChange={(e) => setStatus(e.target.value)}>
                <option value="Approved">Approved</option>
                <option value="Reject">Reject</option>
              </select>
            </div>
            <button onClick={resetInputField}>Update</button>
          </article>
        )}
      </form>
    </div>
  );
};

export default CommponentDetails;
