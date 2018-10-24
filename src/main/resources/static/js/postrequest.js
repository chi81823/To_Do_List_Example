$( document ).ready(function() {

    $("#todolistForm").submit(function(event) {
		event.preventDefault();
		ajaxPost();
	});
    
    
    function ajaxPost(){
    	var formData = {
    		name : $("#name").val(),
    		content :  $("#content").val()
    	}

    	$.ajax({
			type : "POST",
			contentType : "application/json",
			url : window.location + "api/todolist/",
			data : JSON.stringify(formData),
			dataType : 'json',
			success : function(result) {

					$("#postResultDiv").html("<p style='background-color:#7FA7B0; color:white; padding:20px 20px 20px 20px'>" + 
												"Post Successfully! <br>" +
												"---> ToDoList: Name = " +
												result.name +
												" ,Content = " +
												 result.content +
												 "</p>");

				console.log(result);
			},
			error : function(e) {
				alert("Error!")
				console.log("ERROR: ", e);
			}
		});

    	// Reload
    	resetData();
    	window.location.reload();
    }
    
    function resetData(){
    	$("#name").val("");
    	$("#content").val("");
    }
})