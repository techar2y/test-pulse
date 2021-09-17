/*CREATE TABLE IF NOT EXISTS `EMPLOYEES`(
                                         `id`          INTEGER PRIMARY KEY,
                                         `name`       VARCHAR(64) NOT NULL,
                                         `position`      VARCHAR(64) NOT NULL,
                                         'departement'  VARCHAR(128) NOT NULL,
                                         'salary'  INTEGER NOT NULL
);

INSERT INTO EMPLOYEES("id", "name", "position", "departement", "salary")
VALUES (1, 'Artur', 'Junior', 'IT', 100000 );*/


CREATE TABLE departments (
                              id                INTEGER IDENTITY,
                              department_name  VARCHAR(100) NOT NULL,
                              CONSTRAINT departments_id_pk PRIMARY KEY (id)
);


CREATE TABLE employees (
                           id          INTEGER IDENTITY,
                           name       VARCHAR(100) NOT NULL,
                           position      VARCHAR(100) NOT NULL,
                           departments_id      VARCHAR(100) NOT NULL,
                           salary       INTEGER NOT NULL,
                           CONSTRAINT employees_id_pk PRIMARY KEY (id),
                           CONSTRAINT employees_id_departments_id_fk
                               FOREIGN KEY (departments_id)
                                   REFERENCES departments(id)
);

INSERT INTO departments (department_name) SELECT 'IT';

INSERT INTO employees SELECT 1, 'Name', 'Junior', 1, 1000;