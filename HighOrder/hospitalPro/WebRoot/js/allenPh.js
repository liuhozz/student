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
//                var endtime = new Date($(this).attr("endtime")).getTime();//ȡ��������(����ֵ)
//                var nowtime = new Date().getTime();        //���������(����ֵ)
//                var youtime = endtime-nowtime;//���ж��(����ֵ)
//                var seconds = youtime/1000;
//                var minutes = Math.floor(seconds/60);
//                var hours = Math.floor(minutes/60);
//                var days = Math.floor(hours/24);
//                var CDay= days ;
//                var CHour= hours % 24;
//                var CMinute= minutes % 60;
//                var CSecond= Math.floor(seconds%60);//"%"��ȡ�����㣬�������Ϊ60��һ��ȡ������Ȼ��ֻҪ������
//                if(endtime<=nowtime){
//                        $(this).html("")//�����������С�ڵ�ǰ���ھ���ʾ������
//                        }
//          });
//   setTimeout("Endtime()",1000);
//  };
//
//$(function(){
//      Endtime();
//   });