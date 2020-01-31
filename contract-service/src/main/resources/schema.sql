CREATE TABLE CONTRACT(
    CONTRACT_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    CONTRACT_NUMBER char(5) not null UNIQUE,
    TYPE VARCHAR(10) NOT NULL,
    PERIOD INT NOT NULL,
    START_DATE DATE NOT NULL,
    BALANCE DECIMAL NOT NULL
);

CREATE SEQUENCE CONTRACT_SEQUENCE_ID START WITH 6;

CREATE TABLE CONTRACT_CONTRACTOR(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    CONTRACT_ID BIGINT NOT NULL,
    CONTRACTOR_NUMBER char(5) NOT NULL,
    FOREIGN KEY (CONTRACT_ID) REFERENCES CONTRACT (CONTRACT_ID) ON DELETE CASCADE
);