# spring_mongo
API 1 - insert the item
http://localhost:8989/demo/addBook
{
"id":4,
"name": "Ramesh",
"email": "ramesh@gmail.com",
"phone": "976464564356",
"checkIn": "2023-10-05T12:00:00",
"checkOut": "2023-10-09T11:59:59",
"room": 1,
"status": "booked",
"proofDetails":{
"code":"DL"
}
}

API 2 - To delete the item
http://localhost:8989/demo/delete/0

API 3 - Fill all
http://localhost:8989/demo/findAllBooks\

API 4 - Find all with filter and pagination
http://localhost:8989/demo/findBooks?page=0&size=10&filter=name%7Ceq%7CRamesh




