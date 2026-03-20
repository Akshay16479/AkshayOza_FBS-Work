fetch("http://localhost:8080/employee", {
	
	method: "POST",
	headers: {
		
		"Content-Type" : "application/json"
		
	},
	body: JSON.stringify({
		
		"eId" : 111,
		"eName" : "Akshay",
		"eSal" : 50000,
		
	})

});