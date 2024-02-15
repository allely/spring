import { Routes, Route } from 'react-router-dom';
import loadable from '@loadable/component';
// import Home from './pages/Home';
// import About from './pages/About';
// import Profile from './pages/Profile';
// import ProfileHeader from './pages/ProfileHeader';
import MainLayout from './layouts/MainLayout';
// import NotFound from './pages/NotFound';

const Home = loadable(() => import('./pages/Home'));
const About = loadable(() => import('./pages/About'));
const NotFound = loadable(() => import('./pages/NotFound'));

function App() {
  return (
    <Routes>
      <Route element={<MainLayout />} >
        <Route index element={<Home />} />
        <Route path="/about" element={<About />} />
      </Route>

      {/* 위에 있는 경로 확인 후 없을 때 열리도록 */}
      <Route path="*" element={<NotFound />}></Route> 
      
    </Routes>
  );
}

export default App;
