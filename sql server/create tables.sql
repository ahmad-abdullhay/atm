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
insert into oneUserTransactions values (-10,111)

create table twoUsersTransactions (
  amount int,
  firstUserId int FOREIGN KEY REFERENCES Users(id),
  secondUserId int FOREIGN KEY REFERENCES Users(id),

)

select * from twoUsersTransactions where firstUserId = 222 or secondUserId = 222