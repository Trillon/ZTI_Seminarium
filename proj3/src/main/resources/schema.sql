CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  username VARCHAR(30),
  password  VARCHAR(50),
  role VARCHAR(10)
);

INSERT INTO users VALUES (1, 'admin', 'admin', 'ROLE_ADMIN');
INSERT INTO users VALUES (2, 'user', 'user', 'ROLE_USER');