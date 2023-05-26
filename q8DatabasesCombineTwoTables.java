# Write your MySQL query statement below for combining two tables

select firstName, lastName, city, state 
from Person 
left join Address on Person.PersonId= Address.PersonId