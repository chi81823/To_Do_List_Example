$(document).ready(function() {

    $("#todolistForm").submit(function(event) {
		event.preventDefault();
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
                console.log(result);
            },
            error : function(e) {
                alert("Error!")
                console.log("ERROR: ", e);
            }
        });
        window.location.reload();
	});

	$("#todolistUpdateForm").submit(function(event) {
        event.preventDefault();
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
        window.location.reload();
    });

    $("#toDoListTable").on("click","a",function() {
        var todolistId = $(this).parent().find("#deleteId").val();

        $.ajax({
            type : "DELETE",
            url : window.location + "api/todolist/" + todolistId,
            success: function(result){
                console.log(result);
            },
            error : function(e) {
                alert("ERROR: ", e);
                console.log("ERROR: ", e);
            }
        });
        window.location.reload();
    });

    $.ajax({
        type : "GET",
        url : window.location + "api/todolist/all",
        success: function(result){
            $.each(result, function(index, todolist){
                var toDoListRow = '<tr>' + index +
                                  '<td>' + todolist.id + '</td>' +
                                  '<td>' + todolist.name + '</td>' +
                                  '<td>' + todolist.content + '</td>' +
                                  '<td>' +
                                  '<input type="hidden" id="deleteId" value=' + todolist.id + '>' +
                                  '<a>' + '<button type="submit" >Delete</button>' + '</a>' +
                                  '</td>' + '</tr>';
                $('#toDoListTable tbody').append(toDoListRow);
            });
        },
        error : function(e) {
            alert("ERROR: ", e);
            console.log("ERROR: ", e);
        }
    });
})