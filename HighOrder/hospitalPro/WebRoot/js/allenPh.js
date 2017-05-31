	var param;
	param=webdir+"plug/getdate.asp?";
	$('#datetime').html("<img src="+webdir+"skins/2011/images/loading.gif>");
	$.ajax({
	type:"post",
	cache:false,
	url:param,
	timeout:20000,
//	error:function(){$('#datetime').html(Ajax_msg);},
	success:function(t0)
	{
		$('#ggtxt').html(t0);
	 }
	});




//function Endtime(){
//          $(".allen").each(function(){
//                var endtime = new Date($(this).attr("endtime")).getTime();//取结束日期(毫秒值)
//                var nowtime = new Date().getTime();        //今天的日期(毫秒值)
//                var youtime = endtime-nowtime;//还有多久(毫秒值)
//                var seconds = youtime/1000;
//                var minutes = Math.floor(seconds/60);
//                var hours = Math.floor(minutes/60);
//                var days = Math.floor(hours/24);
//                var CDay= days ;
//                var CHour= hours % 24;
//                var CMinute= minutes % 60;
//                var CSecond= Math.floor(seconds%60);//"%"是取余运算，可以理解为60进一后取余数，然后只要余数。
//                if(endtime<=nowtime){
//                        $(this).html("")//如果结束日期小于当前日期就提示过期啦
//                        }
//          });
//   setTimeout("Endtime()",1000);
//  };
//
//$(function(){
//      Endtime();
//   });