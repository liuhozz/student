$(document).ready(function(){
	  $('#fontsize a').click(function(){
			$('#fontsize a').css('color','#000000');
			$(this).css('color','#2A8701');
			$('#mytext').css('font-size',$(this).attr("rel")+'px');
			$('#mytext p').css('font-size',$(this).attr("rel")+'px');
			$('#mytext p span').css('font-size',$(this).attr("rel")+'px');
	  });
	  $('.T_size').click(function(){
			$('.T_size').css('color','#000000');
			$('.T_size').css('font-weight','normal');
			$(this).css('color','#2A8701');
			$(this).css('font-weight','bold');
			$('#mytext').css('font-size',$(this).attr("rel")+'px');
			$('#mytext p').css('font-size',$(this).attr("rel")+'px');
			$('#mytext p span').css('font-size',$(this).attr("rel")+'px');
	  });
});


function copyurl(url){
var testCode=url;
	if(copy2Clipboard(testCode)!=false){
		alert("�Ѹ��ƣ�ʹ��Ctrl+Vճ����������������Ѱ�`");
	}
}
copy2Clipboard=function(txt)
{
if(window.clipboardData)
{
	window.clipboardData.clearData();
	window.clipboardData.setData("Text",txt);
}
else if(navigator.userAgent.indexOf("Opera")!=-1)
{
	window.location=txt;
}
else if(window.netscape)
{
	try{
	   netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
	}
catch(e){
   alert("����firefox��ȫ�������������м�������������'about:config'��signed.applets.codebase_principal_support'����Ϊtrue'֮�����ԡ�");
   return false;
}
var clip=Components.classes['@mozilla.org/widget/clipboard;1'].createInstance

(Components.interfaces.nsIClipboard);
if(!clip)return;
var trans=Components.classes['@mozilla.org/widget/transferable;1'].createInstance

(Components.interfaces.nsITransferable);
if(!trans)return;
trans.addDataFlavor('text/unicode');
var str=new Object();
var len=new Object();
var str=Components.classes["@mozilla.org/supports-string;1"].createInstance
(Components.interfaces.nsISupportsString);
var copytext=txt;str.data=copytext;
trans.setTransferData("text/unicode",str,copytext.length*2);
var clipid=Components.interfaces.nsIClipboard;
if(!clip)return false;
clip.setData(trans,null,clipid.kGlobalClipboard);
}
}