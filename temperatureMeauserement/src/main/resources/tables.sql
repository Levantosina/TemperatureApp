Create table Measurement(
    id int primary key generated always as identity,
    value double precision not null,
    raining boolean not null,
    measurement_date_time timestamp not null,
    sensor varchar(100) references Sensor(name)
);


create table Sensor(
    id int primary key generated always as identity,
    name varchar(255) not null unique
);