CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  username VARCHAR(30),
  password  VARCHAR(50),
  enabled boolean
);

CREATE TABLE roles (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30)
);

CREATE TABLE users_roles (
  id         INTEGER PRIMARY KEY,
  user_id    INTEGER,
  role_id    INTEGER
);

INSERT INTO users VALUES (1, 'admin', 'admin', true);
INSERT INTO users VALUES (2, 'user', 'user', true);

INSERT INTO roles VALUES (1, 'ROLE_USER');
INSERT INTO roles VALUES (2, 'ROLE_ADMIN');

INSERT INTO users_roles VALUES (1, 1, 2);
INSERT INTO users_roles VALUES (2, 2, 1);