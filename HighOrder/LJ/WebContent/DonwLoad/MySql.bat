@echo off &title 启动或关闭MySQL服务(author:Bing)
for /f "skip=3 tokens=4" %%i in ('sc query MySQL') do set "zt=%%i" &goto :next
:next
if /i "%zt%"=="RUNNING" (goto 1)
if /i "%zt%"=="STOPPED" (goto 2)
:1
echo MySQL服务在运行，现在将停止运行...
net stop MySQL

exit
 
:2
echo MySQL服务现在处理停止状态,将进行启动...
net start MySQL
exit
pause>null