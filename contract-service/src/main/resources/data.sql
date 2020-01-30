INSERT INTO CONTRACT (CONTRACT_NUMBER, TYPE, PERIOD, START_DATE, BALANCE) VALUES ('00011', 'Y', 1, '2020-01-01', 1000);
INSERT INTO CONTRACT (CONTRACT_NUMBER, TYPE, PERIOD, START_DATE, BALANCE) VALUES ('00022', 'M', 5, '2020-01-31', 2000);
INSERT INTO CONTRACT (CONTRACT_NUMBER, TYPE, PERIOD, START_DATE, BALANCE) VALUES ('00033', 'Y', 2, '2019-12-31', 3000);
INSERT INTO CONTRACT (CONTRACT_NUMBER, TYPE, PERIOD, START_DATE, BALANCE) VALUES ('00044', 'Y', 3, '2019-01-01', 4000);
INSERT INTO CONTRACT (CONTRACT_NUMBER, TYPE, PERIOD, START_DATE, BALANCE) VALUES ('00055', 'M', 9, '2020-02-01', 5000);

INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00011', '00001');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00022', '00001');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00022', '00002');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00033', '00001');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00033', '00002');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00033', '00003');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00044', '00004');
INSERT INTO CONTRACT_CONTRACTOR (CONTRACT_NUMBER, CONTRACTOR_NUMBER) VALUES ('00055', '00005');