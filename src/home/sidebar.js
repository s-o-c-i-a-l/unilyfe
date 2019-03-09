import React from 'react';
import { slide as Menu } from 'react-burger-menu';

export default props => {
  return (
    <Menu>
      <a className="Home" href="/">
        Home
      </a>

      <a className="My Society" href="/laravel">
        My Society
      </a>

      <a className="Explore" href="/angular">
        Explore
      </a>

      <a className="Chats" href="/react">
        Chats
      </a>

      <a className="Sign Out" href="/node">
        Sign Out
      </a>
    </Menu>
  );
};
