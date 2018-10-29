$( document ).ready(function() {

    $("#todolistUpdateForm").submit(function(event) {
		event.preventDefault();
		ajaxPut();
	});

	function ajaxPut(){
	    var formData = {
	        id : $("#updateId").val(),
            name : $("#updateName").val(),
            content : $("#updateContext").val()
        }
        var id = $("#updateId").val();

        console.log("formData before PUT: " + formData);

        $.ajax({
        	type : "PUT",
        	contentType : "application/json",
        	url : window.location + "api/todolist/" + id,
        	data : JSON.stringify(formData),
        	dataType : 'json',
        	success : function(result) {
                console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});
    }
})