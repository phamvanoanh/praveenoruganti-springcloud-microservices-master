DROP TABLE IF EXISTS users1;
CREATE TABLE users1(userId INTEGER IDENTITY PRIMARY KEY,userName VARCHAR(100) NOT NULL,userEmail VARCHAR(100) DEFAULT NULL,address VARCHAR(100) DEFAULT NULL);