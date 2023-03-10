CREATE TABLE users
(
    id          BIGSERIAL PRIMARY KEY,
    login varchar,
    password varchar
);

CREATE INDEX user_login_idx ON users (login);