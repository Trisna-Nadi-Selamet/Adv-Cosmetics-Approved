import CommponentList from './CommponentList';
import useFetch from './useFetch';

const Home = () => {
  //const { error, isPending, data: apps } = useFetch('http://localhost:8081/api');
  const { error, isPending, data: apps } = useFetch('http://localhost:8081/api');
  return (
    <div className="home">
      {error && <div>{error}</div>}
      {isPending && <div>Loading...</div>}
      {apps && <CommponentList apps={apps} />}
    </div>
  );
};

export default Home;
