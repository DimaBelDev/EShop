INSERT INTO users (id, archive, email, name, password, role)
VALUES (1, false, 'mail@mail.ru', 'admin', '$2a$10$J3ATYSpUZG4TT86LMjll7..yXR2BkqJJMItF8qhD4pY.btYvL7azG', 'ADMIN');

ALTER SEQUENCE user_seq RESTART WITH 2;