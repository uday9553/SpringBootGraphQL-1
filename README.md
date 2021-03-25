# spring-boot-graphQL
GraphQL is a relatively new concept from Facebook that is billed as an alternative to REST for Web APIs

1.http://localhost:8090/emp/getAll
{
  getAllEmployees{
    id
  	name
    mobile
    email
    role
  	
	}
}

2.http://localhost:8090/emp/getEmpByEmail
{
  findEmployee(email:"uday@gmail.com"){
  	id
  	name
    mobile
    email
    role
	}
}
