CREATE TABLE customer
(
    id                   bigint(20)   NOT NULL AUTO_INCREMENT,
    first_name           varchar(50) NOT NULL ,
    last_name            varchar(50) NOT NULL,
    birth_date           date         NOT NULL,
    PRIMARY KEY (id)
);
