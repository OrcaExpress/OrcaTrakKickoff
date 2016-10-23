<!-- Depending on how you execute these statements it my require to add ";" after each statement or not -->

CREATE TABLE grouptable (USERID VARCHAR(255) NOT NULL, GROUPID VARCHAR(255), PRIMARY KEY (USERID));
CREATE TABLE usertable (USERID VARCHAR(255) NOT NULL, PASSWORD VARCHAR(255), PRIMARY KEY (USERID));

<!-- password is 'tyler' but here is encryped with SHA-256 algorithm
INSERT INTO usertable (USERID, PASSWORD) VALUES ('jsfsessions@gmail.com', 'b258f8614815e4157b9eab23d55ac5d0ff77a97ef4a63800089141225d560eee');
<!-- password is 'leonard' but here is encryped with SHA-256 algorithm
INSERT INTO usertable (USERID, PASSWORD) VALUES ('leoprivacy@gmail.com', 'b76aefa8fe4304f650962fb4af77b4db4b13d34ac9615391126027232ec16822');

INSERT INTO grouptable (USERID, GROUPID) VALUES ('jsfsessions@gmail.com', 'ADMINS');
INSERT INTO grouptable (USERID, GROUPID) VALUES ('leoprivacy@gmail.com', 'USERS');

