SQL Query

Customers Table
Columns: CustomerID (Primary Key), Name, Phone, Email
Primary Key: CustomerID

Orders Table
Columns: OrderID (Primary Key), CustomerID (Foreign Key), OrderDate
Primary Key: OrderID
Foreign Key: CustomerID references Customers(CustomerID)

OrderItems Table
Columns: OrderItemID (Primary Key), OrderID (Foreign Key), ProductID, Quantity
Primary Key: OrderItemID
Foreign Key: OrderID references Orders(OrderID)

ShippingAddresses Table
Columns: AddressID (Primary Key), CustomerID (Foreign Key), Address
Primary Key: AddressID
Foreign Key: CustomerID references Customers(CustomerID)

1 Sol=>
Select Name, Phone from Customers
where CustomerID not in (Select Distinct CustomerID from Orders);

2 Sol =>

Select C.Name, C.Email from Customers C
where C.CustomerID in (
	Select O.CustomerID from Orders O
	join (
	Select OrderID, Sum(Quantity) as TotalItems from OrderItems group by OrderID
	Having TotalItems>=5;
	) subquery ON O.OrderID = subquery.OrderID
);