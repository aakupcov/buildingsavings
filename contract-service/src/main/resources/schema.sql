CREATE TABLE CONTRACT(
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    CONTRACT_NUMBER char(5) not null UNIQUE,
    TYPE VARCHAR(10) NOT NULL,
    PERIOD INT NOT NULL,
    START_DATE DATE NOT NULL,
    BALANCE DECIMAL NOT NULL
);

CREATE TABLE CONTRACT_CONTRACTOR(
    ID BIGINT NOT NULL,
    CONTRACTOR_NUMBER char(5) NOT NULL,
    FOREIGN KEY (ID) REFERENCES CONTRACT (ID)
);