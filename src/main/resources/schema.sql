CREATE TABLE positions (
                           id               INTEGER IDENTITY,
                           position			VARCHAR(64) NOT NULL,
                           CONSTRAINT positions_id_pk PRIMARY KEY (id)
);

--CREATE TABLE positions (id INTEGER IDENTITY, position VARCHAR(64) NOT NULL, CONSTRAINT positions_id_pk PRIMARY KEY (id));

CREATE TABLE departments (
                             id                 INTEGER IDENTITY,
                             department_name    VARCHAR(64) NOT NULL,
                             CONSTRAINT departments_id_pk PRIMARY KEY (id)
);

--CREATE TABLE departments (id INTEGER IDENTITY, department_name VARCHAR(64) NOT NULL, CONSTRAINT departments_id_pk PRIMARY KEY (id));

CREATE TABLE employees (
                           id               INTEGER IDENTITY,
                           name             VARCHAR(64) NOT NULL,
                           position_id      INTEGER NOT NULL,
                           department_id    INTEGER NOT NULL,
                           salary           INTEGER NOT NULL,
                           CONSTRAINT employees_id_pk PRIMARY KEY (id),
                           CONSTRAINT employees_id_departments_id_fk
                               FOREIGN KEY (department_id)
                                   REFERENCES departments(id),
                           CONSTRAINT employees_id_positions_id_fk
                               FOREIGN KEY (position_id)
                                   REFERENCES positions(id)
);

--CREATE TABLE employees (id INTEGER IDENTITY, name VARCHAR(64) NOT NULL, position_id INTEGER NOT NULL, department_id INTEGER NOT NULL, salary INTEGER NOT NULL, CONSTRAINT employees_id_pk PRIMARY KEY (id), CONSTRAINT employees_id_departments_id_fk FOREIGN KEY (department_id) REFERENCES departments(id), CONSTRAINT employees_id_positions_id_fk FOREIGN KEY (position_id) REFERENCES positions(id));


CREATE INDEX index_position_id
    ON positions (id);

CREATE INDEX index_position_name
    ON positions (position);

CREATE INDEX index_departments_id
    ON departments (id);

CREATE INDEX index_departments_name
    ON departments (department_name);

CREATE INDEX index_employees_id
    ON employees (id);

CREATE INDEX index_employees_salary
    ON employees (salary);

/*INSERT INTO positions (position) SELECT 'Junior';
INSERT INTO departments (department_name) SELECT 'It';
INSERT INTO employees SELECT 'Artur', 1, 1, 1000;

drop table departments;
drop table positions;
drop table employees;*/