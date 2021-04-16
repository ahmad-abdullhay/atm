create table Users (
Id int primary key,
password varchar(20),
accountBalance int,
)
select * from Users
create table oneUserTransactions (
  amount int,
  userId int FOREIGN KEY REFERENCES Users(id),
)

create table twoUsersTransactions (
  amount int,
  firstUserId int FOREIGN KEY REFERENCES Users(id),
  secondUserId int FOREIGN KEY REFERENCES Users(id),

)

