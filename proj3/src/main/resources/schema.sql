CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  username VARCHAR(30),
  password  VARCHAR(50),
  enabled boolean
);

CREATE TABLE authorities (
  username VARCHAR(30),
  authority  VARCHAR(50)
);

INSERT INTO users VALUES (1, 'admin', 'admin', true);
INSERT INTO users VALUES (2, 'user', 'user', true);

INSERT INTO authorities VALUES ('user', 'ROLE_USER');
INSERT INTO authorities VALUES ('admin', 'ROLE_ADMIN');