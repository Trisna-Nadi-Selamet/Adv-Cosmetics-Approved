import { Link } from 'react-router-dom';

const CommponentList = ({ apps }) => {
  return (
    <div className="blog-list">
      {apps.map((app) => (
        <div className="blog-preview" key={app.id}>
          <Link to={`/api/${app.id}`}>
            <h4>By Name :{app.userName}</h4>
            <h2>{app.description}</h2>
            <p>
              <b>Code :</b> {app.dataid} - <b>{app.status}</b>
            </p>
          </Link>
        </div>
      ))}
    </div>
  );
};

export default CommponentList;
