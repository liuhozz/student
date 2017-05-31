$(function(){
	$("#input_1").keyup(function(){
	
		var valu=$("#input_1").val();
		
		
		$.post("FindWordsServlet",{value:valu},function(data){   //只有在servlet返回response才会执行function这个回调函数
			$(data).each(function(index,w){
				
				$("#div1").html(w.words+"<br/>");
			});
		},"json");
			
		
	});
	
	
});